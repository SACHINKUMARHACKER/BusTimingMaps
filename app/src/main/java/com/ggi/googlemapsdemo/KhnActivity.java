package com.ggi.googlemapsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class KhnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khn);

        ArrayList<Bus> busArrayList = new ArrayList<>();


        Bus b1 = new Bus("Khanna -> Ludhiana","7:45 am to 8:45 am");
        Bus b2 = new Bus("Khanna -> Ludhiana","8:10 am to 9:10 am");
        Bus b3 = new Bus("Khanna -> Ludhiana","8:50 am to 9:50 am");
        Bus b4 = new Bus("Doraha -> Ludhiana","9:30 am to 10:15 am");
        Bus b5 = new Bus("Khanna -> Ludhiana","8:25 am to 9:25 am");
        Bus b6 = new Bus("Doraha -> Ludhiana","8:35 am to 9:20 am");
        Bus b7 = new Bus("Sahnewal chowk -> Ludhiana","9:00 am to 9:30 am");
        Bus b8 = new Bus("Sahnewal chowk -> Ludhiana","7:45 am to 8:15 am");
        Bus b9 = new Bus("Doraha -> Ludhiana","7:45 am to 8:15 am");
        Bus b10 = new Bus("Sherpur chowk -> Ludhiana","7:45 am to 8:00 am");

        busArrayList.add(b1);
        busArrayList.add(b2);
        busArrayList.add(b3);
        busArrayList.add(b4);
        busArrayList.add(b5);
        busArrayList.add(b6);
        busArrayList.add(b7);
        busArrayList.add(b8);
        busArrayList.add(b9);
        busArrayList.add(b10);


        BusAdapter adapter = new BusAdapter(getApplicationContext(),busArrayList);
        ListView listView= findViewById(R.id.bus_view);
        listView.setAdapter(adapter);




    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(KhnActivity.this, BeginActivity.class));
        finish();
        super.onBackPressed();
    }
}
