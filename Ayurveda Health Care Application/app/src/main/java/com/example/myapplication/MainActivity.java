package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    Fragment fragment;
ImageView healthtools;
ImageView therepies;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment=new HomeFragment();
        loadFragment();

        healthtools=findViewById(R.id.Healttools);
        therepies=findViewById(R.id.therapyimage);

        healthtools.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this,HealthTools.class);
           startActivity(i);
            }

    });
        therepies.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View v){
            Intent j =new Intent(MainActivity.this,Therephies.class);
            startActivity(j);}
        });

        findViewById(R.id.rrHome).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment =new HomeFragment();
                loadFragment();

            }
        });


    }

    private void loadFragment() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout, fragment);
        transaction.addToBackStack("home");
        transaction.commit();
    }
}
