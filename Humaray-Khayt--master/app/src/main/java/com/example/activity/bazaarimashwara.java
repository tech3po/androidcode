
package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class bazaarimashwara extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bazaarimashwara);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Toast.makeText(this, "مقام اور مشورہ دینے کی درخواست Armani", Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                Toast.makeText(this, "مقام اور مشورہ دینے کی درخواست Maheens Fruit", Toast.LENGTH_LONG).show();
                break;
            case R.id.button3:
                Toast.makeText(this, "مقام اور مشورہ دینے کی درخواست Aymas Vegetables", Toast.LENGTH_LONG).show();
                break;
            case R.id.button4:
                Toast.makeText(this, "مقام اور مشورہ دینے کی درخواست Esha ke Maweshi", Toast.LENGTH_LONG).show();
                break;
            case R.id.button5:
                Toast.makeText(this, "مقام اور مشورہ دینے کی درخواست Maria's Kheyt", Toast.LENGTH_LONG).show();
                break;
        }
    }
}