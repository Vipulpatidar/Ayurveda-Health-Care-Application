package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class physio extends AppCompatActivity {
ImageView img;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physio);
    img=findViewById(R.id.backtohomel);
    img.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent q=new Intent(physio.this,MainActivity.class);
            startActivity(q);
        }
    });

    }
}