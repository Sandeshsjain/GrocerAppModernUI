package com.example.grocer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CategoriesActivity extends AppCompatActivity {
    List<Integer> images;
    RecyclerView recyclerView;
    categoriesAdapter adapter;
    TextView fruits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        recyclerView = findViewById(R.id.recylerViewCategory);
        fruits = findViewById(R.id.fruits);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        images = new ArrayList<>();
        images.add(R.drawable.fruits_recyler);
        images.add(R.drawable.grocey_images);
        images.add(R.drawable.dairy_images);
        adapter = new categoriesAdapter(this,images);
        recyclerView.setAdapter(adapter);
        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),FruitsAndVegitableCategoryActivity.class);
                startActivity(intent);
            }
        });
    }
}