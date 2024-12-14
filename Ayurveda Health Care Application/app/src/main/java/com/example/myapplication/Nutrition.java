package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Nutrition extends AppCompatActivity {
ImageView back;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);
    back=findViewById(R.id.home1);
    back.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent r=new Intent(Nutrition.this,MainActivity.class);
            startActivity(r);
        }
    });

    }
}