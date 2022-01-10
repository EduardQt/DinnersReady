package se.hkr.dinnersready;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import se.hkr.dinnersready.api.parsers.JsonParser;
import se.hkr.dinnersready.api.rest.RestClient;
import se.hkr.dinnersready.api.rest.SuccessResponse;
import se.hkr.dinnersready.api.rest.responses.HouseHoldResponse;
import se.hkr.dinnersready.core.AuthComponent;
import se.hkr.dinnersready.core.HouseholdComponent;

public class HouseholdActivity extends AppCompatActivity {

    private Button chooseJoin, chooseCreate;
    private ListView householdList;

    private Map<String, String> houseHoldIds = new HashMap<>();

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_household);

        chooseCreate = (Button) findViewById(R.id.buttonChooseCreate);
        chooseJoin = (Button) findViewById(R.id.buttonChooseJoin);
        householdList = (ListView) findViewById(R.id.householdList);

        ArrayAdapter<String> items = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        householdList.setAdapter(items);
        householdList.setOnItemClickListener((adapterView, view, i, l) -> {
            String test = items.getItem(i);
            HouseholdComponent.getInstance().setHouseHoldName(test);
            HouseholdComponent.getInstance().setHouseHoldId(houseHoldIds.get(test));
            startActivity(new Intent(getApplicationContext(), ManageHouseHoldActivity.class));
        });

        chooseCreate.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), CreateHouseholdActivity.class)));
        chooseJoin.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), JoinHouseholdActivity.class)));


        RestClient restClient = new RestClient();
        restClient
                .setupGet()
                .addHeader("Auth-Code", "")
                .addParameter("user-id", AuthComponent.getInstance().getUserId())
                .execute("http://94.46.243.183:8080/household/find", data -> {
                    Type collectionType = new TypeToken<SuccessResponse<List<HouseHoldResponse>>>() {
                    }.getType();
                    SuccessResponse<List<HouseHoldResponse>> response = JsonParser.getInstance().parse(data, collectionType);

                    runOnUiThread(() -> {
                        items.clear();
                        houseHoldIds.clear();
                        for (HouseHoldResponse houseHoldResponse : response.getContent()) {
                            items.add(houseHoldResponse.getHouseHoldName());
                            houseHoldIds.put(houseHoldResponse.getHouseHoldName(), houseHoldResponse.getId());
                        }
                    });
                }, data -> {

                });

        restClient = new RestClient();
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