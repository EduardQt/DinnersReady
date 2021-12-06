package se.hkr.dinnersready;

import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import se.hkr.dinnersready.api.rest.RestClient;
import se.hkr.dinnersready.core.HouseholdComponent;

public class SendNotification extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_notification);

        EditText notificationTitle = findViewById(R.id.notificationTitleText);
        EditText notificationBody = findViewById(R.id.notificationBodyText);
        Button sendNotification = findViewById(R.id.sendNotificationButton);

        sendNotification.setOnClickListener(v -> {
            String title = notificationTitle.getText().toString();
            String body = notificationBody.getText().toString();

            RestClient restClient = new RestClient();
            restClient
                    .setupPost()
                    .addParameter("title", title)
                    .addParameter("body", body)
                    .addParameter("household-id", HouseholdComponent.getInstance().getHouseHoldId())
                    .execute("http://94.46.243.183:8080/createNotification", data -> { }, data -> { });
        });
    }
}