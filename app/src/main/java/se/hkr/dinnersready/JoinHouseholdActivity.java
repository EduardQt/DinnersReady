package se.hkr.dinnersready;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class JoinHouseholdActivity extends AppCompatActivity {

    private EditText textJoinHouseName, textJoinHousePassword;
    private Button joinHousehold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_household);

        textJoinHouseName = (EditText) findViewById(R.id.editTextJoinHouseName);
        textJoinHousePassword = (EditText) findViewById(R.id.editTextJoinHousePassword);
        joinHousehold = (Button) findViewById(R.id.buttonJoinHousehold);
    }
}