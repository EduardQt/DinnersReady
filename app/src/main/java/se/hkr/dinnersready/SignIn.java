package se.hkr.dinnersready;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import se.hkr.dinnersready.api.parsers.JsonParser;
import se.hkr.dinnersready.api.rest.ErrorResponse;
import se.hkr.dinnersready.api.rest.RestClient;
import se.hkr.dinnersready.api.rest.responses.InvalidLoginResponse;

public class SignIn extends AppCompatActivity implements View.OnClickListener {
    private Button register;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        register = (Button) findViewById(R.id.buttonRegister);
        register.setOnClickListener(this);
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