package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Meditation extends AppCompatActivity {
ImageView back;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation);
back=findViewById(R.id.backtohome4);
back.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent l=new Intent(Meditation.this,MainActivity.class);
        startActivity(l);
    }
});



    }
}