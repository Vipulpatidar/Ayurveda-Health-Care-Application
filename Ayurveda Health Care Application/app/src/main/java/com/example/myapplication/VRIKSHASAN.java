package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class VRIKSHASAN extends AppCompatActivity {
ImageView img;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vrikshasan);
    img=findViewById(R.id.backtoyoga);
    img.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        onBackPressed();
        }
    });


    }
}