package com.ggi.googlemapsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class LdhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ldh);

        ArrayList<Bus> busArrayList = new ArrayList<>();


        Bus b1 = new Bus("Samarala chowk -> Khanna","7:45 am to 8:45 am");
        Bus b2 = new Bus("Samarala chowk -> Khanna","8:10 am to 9:10 am");
        Bus b3 = new Bus("Samarala chowk -> Khanna","8:50 am to 9:50 am");
        Bus b4 = new Bus("Samarala chowk -> Khanna","9:30 am to 10:30 am");
        Bus b5 = new Bus("Sherpur chowk -> Khanna","8:25 am to 9:10 am");
        Bus b6 = new Bus("Sherpur chowk -> Khanna","8:35 am to 9:20 am");
        Bus b7 = new Bus("Sherpur chowk -> Khanna","9:00 am to 9:45 am");
        Bus b8 = new Bus("Sherpur chowk -> Khanna","7:45 am to 8:30 am");
        Bus b9 = new Bus("Sherpur chowk -> Khanna","7:55 am to 8:40 am");
        Bus b10 = new Bus("Sherpur chowk -> Khanna","11:45 am to 12:30 am");

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
        final ListView listView= findViewById(R.id.bus_view);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int position;
                position=i;
                switch (position)
                {
                    case 0: startActivity(new Intent(LdhActivity.this,MapsActivity.class)); break;
                    case 1: startActivity(new Intent(LdhActivity.this,MapsActivity.class)); break;
                    case 2: startActivity(new Intent(LdhActivity.this,MapsActivity.class)); break;

                }

            }
        });

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(LdhActivity.this, BeginActivity.class));
        finish();
        super.onBackPressed();
    }
}
