package com.example.grocer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.TextView;

public class FruitsAndVegitableCategoryActivity extends AppCompatActivity {
    TextView buttonKiwi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits_and_vegitable_category);
        buttonKiwi = findViewById(R.id.buttonKiwi);
        buttonKiwi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MyCartActivity.class);
                startActivity(intent);
            }
        });
    }
}