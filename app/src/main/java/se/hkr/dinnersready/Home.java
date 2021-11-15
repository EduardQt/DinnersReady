package se.hkr.dinnersready;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;

import se.hkr.dinnersready.api.rest.RestClient;
import se.hkr.dinnersready.core.AuthComponent;

public class Home extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        RestClient restClient = new RestClient();
        restClient
                .setupPost()
                .addHeader("Auth-Code", "")
                .addParameter("userId", AuthComponent.getInstance().getUserId() + "")
                .addParameter("key", AuthComponent.getInstance().getKey())
                .execute("http://192.168.3.5:8080/updatekey", data -> { }, data -> { });
        Button createNotification = findViewById(R.id.createNotificationButton);
        createNotification.setOnClickListener(v -> {
            runOnUiThread(() -> {
                startActivity(new Intent(this, SendNotification.class));
            });
        });
    }
}