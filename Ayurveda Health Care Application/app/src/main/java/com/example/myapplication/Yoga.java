package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Yoga extends AppCompatActivity {
ImageView backtohome;
ImageView treepose;
ImageView yoga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);
        treepose=findViewById(R.id.vrikshasan);
    yoga=findViewById(R.id.yogapose);
        backtohome=findViewById(R.id.backtohome3);
    backtohome.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent k=new Intent(Yoga.this,MainActivity.class);
            startActivity(k);
        }
    });
    treepose.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent t =new Intent(Yoga.this,VRIKSHASAN.class);
            startActivity(t);
        }
    });
    yoga.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent t= new Intent(Yoga.this,Yogaexcercise.class);
            startActivity(t);
        }
    });
    }
}