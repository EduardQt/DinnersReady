package se.hkr.dinnersready;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

import se.hkr.dinnersready.api.parsers.JsonParser;
import se.hkr.dinnersready.api.rest.ErrorResponse;
import se.hkr.dinnersready.api.rest.RestClient;
import se.hkr.dinnersready.api.rest.SuccessResponse;
import se.hkr.dinnersready.api.rest.responses.AuthenticationResponse;
import se.hkr.dinnersready.api.rest.responses.InvalidLoginResponse;
import se.hkr.dinnersready.core.AuthComponent;

public class SignIn extends AppCompatActivity implements View.OnClickListener {
    private Button register, signIn;
    private EditText emailText, passwordText;

    private static String TAG = "SignIn";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        register = (Button) findViewById(R.id.buttonRegister);
        register.setOnClickListener(this);

        signIn = (Button) findViewById(R.id.buttonSignIn);
        emailText = (EditText) findViewById(R.id.editTextEmail);
        passwordText = (EditText) findViewById(R.id.editTextPassword);

        signIn.setOnClickListener(this::onClickLogin);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void onClickLogin(View view) {
        String email = this.emailText.getText().toString();
        String password = this.passwordText.getText().toString();

        if (email.length() == 0) {
            this.emailText.setError("You must enter email address");
            this.emailText.requestFocus();

            return;
        }

        if (password.length() == 0) {
            this.emailText.setError("You must enter email address");
            this.emailText.requestFocus();

            return;
        }

        RestClient restClient = new RestClient();
        restClient
                .setupGet()
                .addParameter("username", emailText.getText().toString())
                .addParameter("password", passwordText.getText().toString())
                .execute("http://94.46.243.183:8080/login", data -> {
                    Type collectionType = new TypeToken<SuccessResponse<AuthenticationResponse>>() {
                    }.getType();
                    SuccessResponse<AuthenticationResponse> response = JsonParser.getInstance().parse(data, collectionType);
                    String userId = response.getContent().getUserId();
                    AuthComponent.getInstance().setUserId(userId);

                    FirebaseMessaging.getInstance().getToken()
                            .addOnCompleteListener(new OnCompleteListener<String>() {
                                @Override
                                public void onComplete(@NonNull Task<String> task) {
                                    if (!task.isSuccessful()) {
                                        Log.w(TAG, "Fetching FCM registration token failed", task.getException());
                                        return;
                                    }

                                    // Get new FCM registration token
                                    String token = task.getResult();
                                    AuthComponent.getInstance().setKey(token);
                                    runOnUiThread(() -> {
                                        startActivity(new Intent(getApplicationContext(), HouseholdActivity.class));
                                    });
                                }
                            });
                }, data -> {
                    Type collectionType = new TypeToken<ErrorResponse<InvalidLoginResponse>>() {
                    }.getType();
                    ErrorResponse<InvalidLoginResponse> response = JsonParser.getInstance().parse(data, collectionType);

                    runOnUiThread(() -> {
                        Toast.makeText(getApplicationContext(), response.getContent().getError(), Toast.LENGTH_SHORT).show();
                    });
                });
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.buttonRegister:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
        }
    }
}