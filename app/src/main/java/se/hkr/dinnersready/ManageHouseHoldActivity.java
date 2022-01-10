package se.hkr.dinnersready;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import se.hkr.dinnersready.files.MainFilesActivity;

public class ManageHouseHoldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_house_hold);

        Button createNotificationButton = findViewById(R.id.createNotificationButton);
        createNotificationButton.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), SendNotification.class)));

        Button manageFilesButton = findViewById(R.id.manageFilesButton);
        manageFilesButton.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), MainFilesActivity.class));
        });
    }
}