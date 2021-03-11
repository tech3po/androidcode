package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


    public class MainActivity3 extends AppCompatActivity {
        CardView cropsCard2;
        CardView cropsCard3;
        CardView cropsCard4;
        CardView cropsCard5;
        CardView cropsCard6;
        CardView cropsCard7;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main3);
            cropsCard2 = findViewById(R.id.card_view_crops2);
            cropsCard3 = findViewById(R.id.card_view_crops3);
            cropsCard4 = findViewById(R.id.card_view_crops4);
            cropsCard5 = findViewById(R.id.card_view_crops5);
            cropsCard6 = findViewById(R.id.card_view_gandum);
            cropsCard7 = findViewById(R.id.card_view_crops3919);



            cropsCard2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent crops2ActivityIntent = new Intent(MainActivity3.this, rice.class);
                    startActivity(crops2ActivityIntent);

                }
            });
            cropsCard3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent crops3ActivityIntent = new Intent(MainActivity3.this,mango.class);
                    startActivity(crops3ActivityIntent);
                }
            });
            cropsCard4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent crops4ActivityIntent = new Intent(MainActivity3.this,Aloo.class);
                    startActivity(crops4ActivityIntent);
                }
            });
            cropsCard5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent crops5ActivityIntent = new Intent(MainActivity3.this,kapas.class);
                    startActivity(crops5ActivityIntent);

                }
            });
            cropsCard6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent crops6ActivityIntent = new Intent(MainActivity3.this,gandumwork.class);
                    startActivity(crops6ActivityIntent);

                }
            });
            cropsCard7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent crops7ActivityIntent = new Intent(MainActivity3.this,gannaactivity.class);
                    startActivity(crops7ActivityIntent);

                }
            });
        }

    }





