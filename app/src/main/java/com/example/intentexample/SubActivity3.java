package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.intentexample.databinding.ActivitySub3Binding;

public class SubActivity3 extends AppCompatActivity {

    Intent intent;
    ActivitySub3Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_sub3);
        binding = ActivitySub3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getData();
    }

    private void getData() {
        intent = getIntent();
        int numb = Integer.parseInt(intent.getStringExtra("numb"));

    }
}