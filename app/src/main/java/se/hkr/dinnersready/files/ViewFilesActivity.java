package se.hkr.dinnersready.files;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import se.hkr.dinnersready.R;
import se.hkr.dinnersready.api.parsers.JsonParser;
import se.hkr.dinnersready.api.rest.RestClient;
import se.hkr.dinnersready.api.rest.SuccessResponse;
import se.hkr.dinnersready.api.rest.responses.HouseHoldResponse;
import se.hkr.dinnersready.api.rest.responses.HouseholdFileResponse;
import se.hkr.dinnersready.core.AuthComponent;
import se.hkr.dinnersready.core.FileComponent;
import se.hkr.dinnersready.core.HouseholdComponent;

public class ViewFilesActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_files);

        ListView filesView = findViewById(R.id.householdFilesList);
        ArrayAdapter<String> filesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        filesView.setAdapter(filesAdapter);

        filesView.setOnItemClickListener((parent, view, position, id) -> {
            String fileName = filesAdapter.getItem(position);
            Intent fileModify = new Intent(this, ModifyFileActivity.class);
            fileModify.putExtra("fileName", fileName);
            startActivity(fileModify);
        });

        RestClient restClient = new RestClient();
        restClient
                .setupGet()
                .addHeader("Auth-Code", "")
                .addParameter("household-id", HouseholdComponent.getInstance().getHouseHoldId())
                .execute("http://94.46.243.183:8080/files/view", data -> {
                    Type collectionType = new TypeToken<SuccessResponse<List<HouseholdFileResponse>>>() {
                    }.getType();
                    SuccessResponse<List<HouseholdFileResponse>> response = JsonParser.getInstance().parse(data, collectionType);

                    FileComponent.getInstance().setFiles(response.getContent());
                    runOnUiThread(() -> {
                        filesAdapter.clear();
                        for (HouseholdFileResponse houseHoldResponse : response.getContent()) {
                            filesAdapter.add(houseHoldResponse.getFileName());
                        }
                    });
                }, data -> {

                });
    }
}