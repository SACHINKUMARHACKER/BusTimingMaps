package com.ggi.googlemapsdemo;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(30.911058, 75.879374);
        LatLng sdney = new LatLng(30.887803, 75.887745);
        LatLng sahnewal = new LatLng(30.839555,75.971972);
        //30.839555 75.971972

        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Samarala Chowk")
        .snippet("Bus Timing at 7:45 am"));
        mMap.addMarker(new MarkerOptions().position(sdney).title("Marker in Sherpur Chowk")
                .snippet("Bus Timing at 8:00 am"));
        mMap.addMarker(new MarkerOptions().position(sdney).title("Marker in Sahnewal Chowk")
                .snippet("Bus Timing at 8:15 am"));

        // mMap.moveCamera(CameraUpdateFactory.newLatLng(sdney));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sydney,20));
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(MapsActivity.this,LdhActivity.class));
        super.onBackPressed();
    }
}
