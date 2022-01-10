package se.hkr.dinnersready;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import se.hkr.dinnersready.api.parsers.JsonParser;
import se.hkr.dinnersready.api.rest.RestClient;
import se.hkr.dinnersready.api.rest.SuccessResponse;
import se.hkr.dinnersready.api.rest.responses.HouseHoldResponse;
import se.hkr.dinnersready.core.AuthComponent;

public class JoinHouseholdActivity extends AppCompatActivity {

    private EditText textJoinHouseName, textJoinHousePassword;
    private Button joinHousehold;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_household);

        textJoinHouseName = (EditText) findViewById(R.id.editTextJoinHouseName);
        textJoinHousePassword = (EditText) findViewById(R.id.editTextJoinHousePassword);
        joinHousehold = (Button) findViewById(R.id.buttonJoinHousehold);

        joinHousehold.setOnClickListener(v -> {
            String name = textJoinHouseName.getText().toString();
            String password = textJoinHousePassword.getText().toString();

            if (name.isEmpty()) {
                textJoinHouseName.requestFocus();
                textJoinHouseName.setError("Please enter name");
                return;
            }

            if (password.isEmpty()) {
                textJoinHousePassword.requestFocus();
                textJoinHousePassword.setError("Please enter password");
                return;
            }

            RestClient restClient = new RestClient();
            restClient
                    .setupPost()
                    .addHeader("Auth-Code", "")
                    .addParameter("user-id", AuthComponent.getInstance().getUserId())
                    .addParameter("household-name", name)
                    .addParameter("household-password", password)
                    .execute("http://94.46.243.183:8080/household/join", data -> {
                        runOnUiThread(this::finish);
                    }, data -> {
                        runOnUiThread(() -> {
                            textJoinHouseName.requestFocus();
                            textJoinHouseName.setError("Failed to join household.");
                        });
                    });

        });
    }
}