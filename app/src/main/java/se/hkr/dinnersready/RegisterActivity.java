package se.hkr.dinnersready;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

import se.hkr.dinnersready.api.parsers.JsonParser;
import se.hkr.dinnersready.api.rest.ErrorResponse;
import se.hkr.dinnersready.api.rest.RestClient;
import se.hkr.dinnersready.api.rest.responses.InvalidLoginResponse;
import se.hkr.dinnersready.api.rest.responses.InvalidRegisterResponse;
import se.hkr.dinnersready.core.AuthComponent;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView registerUser;
    private EditText textPerssonsName, textEmailAddress, textPassword, textConfirmPassword;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerUser = (Button) findViewById(R.id.buttonRegisterUser);
        registerUser.setOnClickListener(this);
        textEmailAddress = (EditText) findViewById(R.id.editTextRegisterEmailAddress);
        textPerssonsName = (EditText) findViewById(R.id.editTextRegisterName);
        textPassword = (EditText) findViewById(R.id.editTextRegisterPassword);
        textConfirmPassword = (EditText) findViewById(R.id.editTextConfirmRegisterPassword);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonRegisterUser:
                registerUser();
                break;
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void registerUser() {
        String email = textEmailAddress.getText().toString().trim();
        String password = textPassword.getText().toString().trim();
        String fullName = textPerssonsName.getText().toString().trim();
        String confirmPassword = textConfirmPassword.getText().toString().trim();


        if (fullName.isEmpty()) {
            textPerssonsName.setError("Full name is required");
            textPerssonsName.requestFocus();
            return;
        }

        if (email.isEmpty()) {
            textEmailAddress.setError("Email is required");
            textEmailAddress.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            textEmailAddress.setError("Valid email is required!");
            textEmailAddress.requestFocus();
            return;
        }

        if (password.isEmpty()) {
            textPassword.setError("Password is required");
            textPassword.requestFocus();
            return;
        }

        if (password.length() < 6) {
            textPassword.setError("Password needs to be longer than 6 characters");
            textPassword.requestFocus();
            return;
        }

        if (confirmPassword.isEmpty()) {
            textConfirmPassword.setError("You must confirm the password");
            textConfirmPassword.requestFocus();
            return;
        }

        if (!confirmPassword.equals(password)) {
            textConfirmPassword.setError("Passwords must match");
            textConfirmPassword.requestFocus();
            return;
        }

        RestClient restClient = new RestClient();
        restClient
                .setupPost()
                .addParameter("username", fullName)
                .addParameter("password", password)
                .addParameter("email", email)
                .execute("http://94.46.243.183:8080/register", data -> {
                    runOnUiThread(() -> {
                        startActivity(new Intent(getApplicationContext(), SignIn.class));
                    });
                }, data -> {
                    Type collectionType = new TypeToken<ErrorResponse<InvalidRegisterResponse>>() {
                    }.getType();
                    ErrorResponse<InvalidRegisterResponse> response = JsonParser.getInstance().parse(data, collectionType);
                    String error = response.getContent().getError();
                    String[] errorData = error.split(":");
                    switch (errorData[0]) {
                        case "username":
                            runOnUiThread(() -> {
                                textPerssonsName.setError("Username is in use!");
                                textPerssonsName.requestFocus();
                            });
                            break;
                        case "email":
                            runOnUiThread(() -> {
                                textEmailAddress.setError("Email is in use!");
                                textEmailAddress.requestFocus();
                            });
                            break;
                    }
                });
    }
}