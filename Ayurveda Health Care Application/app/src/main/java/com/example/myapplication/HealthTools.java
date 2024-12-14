package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HealthTools extends AppCompatActivity {
ImageView img2;
ImageView img3;
ImageView img4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_tools);
        img2=findViewById(R.id.Home);
        img4=findViewById(R.id.strees);
        img3=findViewById(R.id.bmi);
        img2.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v) {
                Intent i =new Intent(HealthTools.this,MainActivity.class);
                startActivity(i);
            }


        });

    img3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent l=new Intent(HealthTools.this,Bmi.class);
            startActivity(l);
        }
    });
img4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i=new Intent(HealthTools.this,Stresscalculator.class);
        startActivity(i);
    }
});

    }
    }
