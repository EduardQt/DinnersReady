package se.hkr.dinnersready;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

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


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonRegisterUser:
                registerUser();
                break;
        }
    }

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

        progressBar.setVisibility(View.VISIBLE);
    }
}