package se.hkr.dinnersready.files;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import se.hkr.dinnersready.R;
import se.hkr.dinnersready.api.rest.RestClient;
import se.hkr.dinnersready.api.rest.responses.HouseholdFileResponse;
import se.hkr.dinnersready.core.FileComponent;
import se.hkr.dinnersready.core.HouseholdComponent;

public class ModifyFileActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify_file);

        String fileName = getIntent().getStringExtra("fileName");

        EditText fileTextContentInput = findViewById(R.id.modifyFileTextContentInput);
        Button saveFileButton = findViewById(R.id.modifySaveFileButton);

        for (HouseholdFileResponse file : FileComponent.getInstance().getFiles()) {
            if (file.getFileName().equals(fileName)) {
                fileTextContentInput.setText(file.getFileContent());
            }
        }

        saveFileButton.setOnClickListener(v ->
        {
            RestClient restClient = new RestClient();
            restClient
                    .setupPost()
                    .addParameter("household-id", HouseholdComponent.getInstance().getHouseHoldId())
                    .addParameter("file-name", fileName)
                    .addParameter("file-content", fileTextContentInput.getText().toString())
                    .execute("http://94.46.243.183:8080/files/modify", data -> {
                        runOnUiThread(this::finish);
                    }, data -> {
                    });
        });
    }
}