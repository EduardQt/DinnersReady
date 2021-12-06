package se.hkr.dinnersready;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

import se.hkr.dinnersready.api.parsers.JsonParser;
import se.hkr.dinnersready.api.rest.RestClient;
import se.hkr.dinnersready.api.rest.SuccessResponse;
import se.hkr.dinnersready.api.rest.responses.HouseholdCreationResponse;
import se.hkr.dinnersready.core.AuthComponent;
import se.hkr.dinnersready.core.HouseholdComponent;

public class CreateHouseholdActivity extends AppCompatActivity {

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
        createHousehold.setOnClickListener(this::creation);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void creation(View view) {
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

        RestClient restClient = new RestClient();
        restClient
                .setupPost()
                .addParameter("user-id", AuthComponent.getInstance().getUserId())
                .addParameter("name", householdName)
                .addParameter("password", householdPassword)
                .execute("http://94.46.243.183:8080/household/create", data -> {
                    Type collectionType = new TypeToken<SuccessResponse<HouseholdCreationResponse>>() {
                    }.getType();
                    SuccessResponse<HouseholdCreationResponse> response = JsonParser.getInstance().parse(data, collectionType);

                    String houseHoldId = response.getContent().getHouseHoldId();
                    String houseHoldName = response.getContent().getHouseHoldName();

                    HouseholdComponent.getInstance().setHouseHoldId(houseHoldId);
                    HouseholdComponent.getInstance().setHouseHoldName(houseHoldName);

                    runOnUiThread(() -> {
                        startActivity(new Intent(getApplicationContext(), SendNotification.class));
                    });
                }, data -> {

                });
    }
}