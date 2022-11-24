package com.example.intentexample;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.intent.Product;
import com.example.intentexample.databinding.ActivityMainBinding;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ActivityResultLauncher<Intent> launcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        addEvents();

        launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                result -> {
            if(result.getResultCode() == RESULT_OK && result.getData() != null){
                int pow = result.getData().getIntExtra("pow", 0);
                binding.txtResult.setText(String.valueOf(pow));
            }
                });
    }

    private void addEvents(){
        binding.btnOpenSubActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity1.class);
            }
        });
        binding.btnOpenSubActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Open subactivity 2 and sending data
                Intent intent = new Intent( MainActivity.this, SubActivity2.class);
//
//                //attach data
                intent.putExtra("numb", 8);
                Bundle bundle = new Bundle();
                bundle.putInt("numb",7);
                bundle.putFloat("grades",8.5f);
                bundle.putBoolean("checked",true);
                bundle.putString("say","welcom");



                //Sending object
                Product p = new Product("Heineken",19000);

                bundle.putSerializable("product_inf", (Serializable) p);

                intent.putExtra("my data", bundle);
                startActivity(intent);
            }
        });
        binding.btnOpenSubActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity3.class);
                intent.putExtra("numb", binding.edtNumb.getText().toString());
                startActivity(intent);
                //start activiti

            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity","onDestroy");
    }
}