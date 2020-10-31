package com.example.grocer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FruitsAndVegetableActivity extends AppCompatActivity {
    Button button;
    ImageView cart_click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits_and_vegetable);
        button = findViewById(R.id.addbutton);
        cart_click = findViewById(R.id.cart_click);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),BillActivity.class);
                startActivity(intent);
            }
        });
        cart_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MenueActivity.class);
                startActivity(intent);

            }
        });
    }
}