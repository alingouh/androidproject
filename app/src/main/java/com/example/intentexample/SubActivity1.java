package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.intentexample.databinding.ActivitySub1Binding;
import com.example.intentexample.databinding.ActivitySub2Binding;

public class SubActivity1 extends AppCompatActivity {

    ActivitySub1Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_sub1);
        binding = ActivitySub1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}