package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    CardView cropsCard12;
    CardView cropsCard16;
    CardView cropsCard15;
    CardView cropsCard14;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        cropsCard12 = findViewById(R.id.card_view_crops12);
        cropsCard16 = findViewById(R.id.card_view_crops16);
        cropsCard15 = findViewById(R.id.card_view_crops15);
        cropsCard14 = findViewById(R.id.card_view_crops14);

        cropsCard12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crops2ActivityIntent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(crops2ActivityIntent);
            }
        });
        cropsCard16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crops16ActivityIntent = new Intent(MainActivity2.this, ytpart.class);
                startActivity(crops16ActivityIntent);
            }
        });
        cropsCard15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crops15ActivityIntent = new Intent(MainActivity2.this, bazaarimashwara.class);
                startActivity(crops15ActivityIntent);
            }
        });
        cropsCard14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crops14ActivityIntent = new Intent(MainActivity2.this, MainActivity7.class);
                startActivity(crops14ActivityIntent);
            }
        });
    }
}