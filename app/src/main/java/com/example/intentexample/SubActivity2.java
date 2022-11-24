package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.intent.Product;
import com.example.intentexample.databinding.ActivitySub2Binding;

public class SubActivity2 extends AppCompatActivity {

    ActivitySub2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_sub2);
        binding = ActivitySub2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        showData();

    }
    private void showData(){

//        //Receive data
//        int numb = intent.getIntExtra("numb",8);
//
//
//        String say = intent.getStringExtra("say");
//
//        binding.txtContent.setText("Numb" + numb + "\n"+
//                "Numb" + numb + "\n"+
//                "Numb" + numb + "\n"+
//                "Numb" + numb + "\n" );

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("my data");
        int numb = bundle.getInt("numb" , 0);
        float grades = bundle.getFloat("grades", 0.0f);
        boolean checked = bundle.getBoolean("checked", false);
        String say= bundle.getString("say");

        Product p = (Product) bundle.getSerializable("product_inf");
        String product_inf = p.getProductName() +"-"+ p.getProductPrice();

        binding.txtContent.append("Numb:" + numb +"/n");
        binding.txtContent.append("Grades:" + grades +"/n");
        binding.txtContent.append("Checked:" + checked +"/n");
        binding.txtContent.append("Say:" + say +"/n");


    }
}