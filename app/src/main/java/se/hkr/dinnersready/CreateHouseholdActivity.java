package se.hkr.dinnersready;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateHouseholdActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText textHouseholdName, textHouseholdPassword, textHouseholdConfirmPassword;
    private Button createHousehold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_household);

        textHouseholdName = (EditText) findViewById(R.id.editTextHoseholdName);
        textHouseholdPassword = (EditText) findViewById(R.id.editTextHouseholdPassword);
        textHouseholdConfirmPassword = (EditText) findViewById(R.id.editTextHouseholdPasswordConfirm);
        createHousehold = (Button) findViewById(R.id.buttonCreateHousehold);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonCreateHousehold:
                creation();
                break;
        }
    }

    public void creation() {
        String householdName = textHouseholdName.getText().toString().trim();
        String householdPassword = textHouseholdPassword.getText().toString().trim();
        String householdConfirmPassword = textHouseholdConfirmPassword.getText().toString().trim();

        if (householdName.isEmpty()) {
            textHouseholdName.setError("Household name is required");
            textHouseholdName.requestFocus();
            return;
        }

        if (householdPassword.isEmpty()) {
            textHouseholdPassword.setError("Password is required");
            textHouseholdPassword.requestFocus();
            return;
        }

        if (householdPassword.length() < 6) {
            textHouseholdPassword.setError("Password needs to be longer than 6 characters");
            textHouseholdPassword.requestFocus();
            return;
        }

        if (householdConfirmPassword.isEmpty()) {
            textHouseholdConfirmPassword.setError("You must confirm the password");
            textHouseholdConfirmPassword.requestFocus();
            return;
        }

        if (!householdConfirmPassword.equals(householdPassword)) {
            textHouseholdConfirmPassword.setError("Passwords must match");
            textHouseholdConfirmPassword.requestFocus();
            return;
        }
    }
}