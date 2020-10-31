package com.example.grocer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class BillActivity extends AppCompatActivity {
    RecyclerView  recyclerView;
    List<OrderSummaryData> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
        recyclerView = findViewById(R.id.recyclerViewOrderSummary);
        list = new ArrayList<>();
        setData();
        OrderSummaryAdapter orderSummaryAdapter = new OrderSummaryAdapter(this,list);
        LinearLayoutManager  linearLayoutManager = new LinearLayoutManager(this);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(orderSummaryAdapter);
    }

    private void setData() {
        for(int i = 0;i<5;i++){
            OrderSummaryData orderSummaryData = new OrderSummaryData();
            orderSummaryData.setName("Black Grape");
            orderSummaryData.setPrice("$ 122");
            orderSummaryData.setQuantity("Qty: 1");
            list.add(orderSummaryData);
        }
        for (int i = 0;i<5;i++){
            OrderSummaryData orderSummaryData = new OrderSummaryData();
            orderSummaryData.setName("Orange");
            orderSummaryData.setQuantity("Qty: 2");
            orderSummaryData.setPrice("$ 220");
            list.add(orderSummaryData);
        }
    }
}