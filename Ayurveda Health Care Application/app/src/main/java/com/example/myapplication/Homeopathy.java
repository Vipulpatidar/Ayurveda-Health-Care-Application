package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Homeopathy extends AppCompatActivity {
ImageView back;
ImageView Healthysleep;
ImageView sugar;
ImageView obecity;
ImageView homeopathy;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeopathy);
        Healthysleep=findViewById(R.id.healthysleep);
        homeopathy=findViewById(R.id.whatishomoepathy);
        obecity=findViewById(R.id.overcomingobecity);
        sugar=findViewById(R.id.diabeties);
      back=findViewById(R.id.backtohome2);

      back.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i=new Intent(Homeopathy.this,MainActivity.class);
              startActivity(i);
          }
      });

      Healthysleep.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent w= new Intent(Homeopathy.this,Importanceofsleep.class);
              startActivity(w);
          }
      });
      homeopathy.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent y= new Intent(Homeopathy.this,whatishomoepathy.class);
              startActivity(y);
          }
      });
      obecity.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent y= new Intent(Homeopathy.this,Overcomingobecity.class);
              startActivity(y);
          }
      });
      sugar.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent r= new Intent(Homeopathy.this,Maintainingsugar.class);
              startActivity(r);
          }
      });
    }
}