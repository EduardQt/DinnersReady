package se.hkr.dinnersready;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateHouseholdActivity extends AppCompatActivity {

    private EditText textHouseholdName, textHouseholdPassword , textHouseholdConfirmPassword;
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
}