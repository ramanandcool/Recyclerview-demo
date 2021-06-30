package com.ramannad.recyclerviewdemo;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.ramannad.recyclerviewdemo.databinding.ItemBinding;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    private final List<String> stringList1;
    private final List<String> stringList2;

    public CustomAdapter(List<String> stringList1, List<String> stringList2) {
        this.stringList1 = stringList1;
        this.stringList2 = stringList2;
    }
//    public void updateData(List<String> list1 ,List<String> list2 ){
//        stringList1 = list1;
//        stringList2 = list2;
//    }

    @NotNull
    @Override
    public  MyViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NotNull MyViewHolder holder, int position) {
        holder.title.setText(stringList1.get(position));
        holder.subText.setText(stringList2.get(position));
    }

    @Override
    public int getItemCount() {
        return stringList1.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView title;
        private final TextView subText;
        public MyViewHolder( ItemBinding itemView) {
            super(itemView.getRoot());
            title = itemView.title;
            subText = itemView.subText;
        }
    }
}
