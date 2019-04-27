package com.ggi.googlemapsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BeginActivity extends AppCompatActivity {

    Button mLdhToKhn,mKhnToLdh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);


        mLdhToKhn=findViewById(R.id.ldh_to_khn);
        mKhnToLdh=findViewById(R.id.khn_to_ldh);

        mLdhToKhn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BeginActivity.this, LdhActivity.class));
                finish();
            }
        });

        mKhnToLdh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BeginActivity.this,KhnActivity.class));
                finish();
            }
        });



    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
