package com.ramannad.recyclerviewdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ramannad.recyclerviewdemo.databinding.ActivityMainBinding;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        CustomAdapter adapter = new CustomAdapter(
                Arrays.asList("Title1", "Title2"),
                Arrays.asList("test", "test"));
        RecyclerView recyclerView = binding.recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
        binding.button.setOnClickListener(v -> {
            adapter.updateData(
                Arrays.asList("Updated Title1", "Updated Title2","Updated Title3","Updated Title4","Updated Title5"),
                Arrays.asList("text", "test", "test", "test", "test"));
            adapter.notifyDataSetChanged();
    });
    }
}