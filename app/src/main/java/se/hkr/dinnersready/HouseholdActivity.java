package se.hkr.dinnersready;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import se.hkr.dinnersready.api.rest.RestClient;
import se.hkr.dinnersready.core.AuthComponent;

public class HouseholdActivity extends AppCompatActivity{

    private Button chooseJoin, chooseCreate;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_household);

        chooseCreate = (Button) findViewById(R.id.buttonChooseCreate);
        chooseJoin = (Button) findViewById(R.id.buttonChooseJoin);

        chooseCreate.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(),CreateHouseholdActivity.class)));

        chooseJoin.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(),JoinHouseholdActivity.class)));

        RestClient restClient = new RestClient();
        restClient
                .setupPost()
                .addHeader("Auth-Code", "")
                .addParameter("userId", AuthComponent.getInstance().getUserId())
                .addParameter("key", AuthComponent.getInstance().getKey())
                .execute("http://94.46.243.183:8080/updatekey", data -> {
                }, data -> {
                });
    }
}