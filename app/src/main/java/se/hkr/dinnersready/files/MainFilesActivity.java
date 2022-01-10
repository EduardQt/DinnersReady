package se.hkr.dinnersready.files;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import se.hkr.dinnersready.R;

public class MainFilesActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_files);

        Button createFileButton = findViewById(R.id.createFileButton);
        TextView fileNameTextField = findViewById(R.id.fileNameTextField);
        createFileButton.setOnClickListener(v -> {
            String text = fileNameTextField.getText().toString();
            if (text.isEmpty()) {
                fileNameTextField.requestFocus();
                fileNameTextField.setError("Please enter file name");
                return;
            }

            Intent modifyFile = new Intent(this, CreateFileActivity.class);
            modifyFile.putExtra("fileName", text);
            startActivity(modifyFile);
        });

        Button viewFilesButton = findViewById(R.id.viewFilesButton);
        viewFilesButton.setOnClickListener(v -> {
            Intent viewFilesIntent = new Intent(this, ViewFilesActivity.class);
            startActivity(viewFilesIntent);
        });
    }
}