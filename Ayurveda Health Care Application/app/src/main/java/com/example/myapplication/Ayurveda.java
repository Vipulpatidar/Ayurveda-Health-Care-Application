package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.myapplication.R;

public class Ayurveda extends AppCompatActivity {
    ImageView backtohome;
ImageView feverhomeremedy;
ImageView Prakriti;
ImageView Sitopaldai;
ImageView panchakarma;
ImageView boa;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayurveda);
        backtohome = findViewById(R.id.backtohome);
Sitopaldai=findViewById(R.id.Sitopaldai);
boa= findViewById(R.id.boa);
panchakarma=findViewById(R.id.panchakarma);
Prakriti=findViewById(R.id.Prakriti);
feverhomeremedy=findViewById(R.id.feverhomeremedy);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ayurveda.this, MainActivity.class);
                startActivity(i);
            }
        });
feverhomeremedy.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent q= new Intent(Ayurveda.this,Homeremedyfever.class);
        startActivity(q);
    }
});
panchakarma.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent w=new Intent(Ayurveda.this,Panchakarma.class);
        startActivity(w);
    }
});
boa.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent r=new Intent(Ayurveda.this,Ayurvedabenefits.class);
        startActivity(r);
    }
});
Prakriti.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent q= new Intent(Ayurveda.this, com.example.myapplication.Prakriti.class);
        startActivity(q);
    }
});
Sitopaldai.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent q= new Intent(Ayurveda.this,SITOPALADI.class);
        startActivity(q);
    }
});
    }
}