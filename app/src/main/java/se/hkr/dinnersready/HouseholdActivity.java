package se.hkr.dinnersready;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HouseholdActivity extends AppCompatActivity{

    private Button chooseJoin, chooseCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_household);

        chooseCreate = (Button) findViewById(R.id.buttonCreateHousehold);
        chooseJoin = (Button) findViewById(R.id.buttonJoinHousehold);

        chooseCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HouseholdActivity.this,CreateHouseholdActivity.class));
            }
        });

        chooseJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HouseholdActivity.this,JoinHouseholdActivity.class));
            }
        });
    }
}