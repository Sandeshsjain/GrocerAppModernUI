package com.example.grocer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class categoriesAdapter extends RecyclerView.Adapter<categoriesAdapter.CategoryViewHolder> {
    Context context;
    List<Integer> images;

    public categoriesAdapter(Context context, List<Integer> images) {
        this.context = context;
        this.images = images;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout1,parent,false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        holder.linear1.setBackgroundResource(images.get(position));
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout linear1;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            linear1 = itemView.findViewById(R.id.linear1);
        }
    }
}
