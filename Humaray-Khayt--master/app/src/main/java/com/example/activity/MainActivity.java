package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
  CardView cropsCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cropsCard = findViewById(R.id.card_view_crops);
    cropsCard.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent cropsActivityIntent = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(cropsActivityIntent);
        }
    });
    }
}