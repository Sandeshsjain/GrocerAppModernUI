package com.example.grocer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OrderSummaryAdapter extends RecyclerView.Adapter<OrderSummaryAdapter.OrderSummaryViewHolder> {
    Context context;
    List<OrderSummaryData> list;

    public OrderSummaryAdapter(Context context, List<OrderSummaryData> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public OrderSummaryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_summary_layout,parent,false);
        return new OrderSummaryAdapter.OrderSummaryViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull OrderSummaryViewHolder holder, int position) {
        holder.qtvTV.setText(list.get(position).getQuantity());
        holder.priceTV.setText(list.get(position).getPrice());
        holder.nameTV.setText(list.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class OrderSummaryViewHolder extends RecyclerView.ViewHolder{
        TextView nameTV,priceTV,qtvTV;
        public OrderSummaryViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTV = itemView.findViewById(R.id.nameTV);
            priceTV = itemView.findViewById(R.id.priceTV);
            qtvTV = itemView.findViewById(R.id.qtvTV);
        }
    }
}
