package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.myapplication.R;

public class Therephies extends AppCompatActivity {
ImageView img;
ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    ImageView img7;
    ImageView img8;
    ImageView img9;
    ImageView img10;
ImageView img11;
ImageView img12;
ImageView img13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_therephies);
        img = findViewById(R.id.back12);
        img2 = findViewById(R.id.ayurveda);
        img3 = findViewById(R.id.homeopathy);
        img4 = findViewById(R.id.naturopathy);
        img5 = findViewById(R.id.yoga);
        img6 = findViewById(R.id.meditation);
        img7 = findViewById(R.id.physiothereapy);
        img8 = findViewById(R.id.phychology);
        img9 = findViewById(R.id.Nutrition);
        img10 = findViewById(R.id.suppliments);
        img11 = findViewById(R.id.herbalmedicine);
        img12 = findViewById(R.id.unani);
        img13 = findViewById(R.id.siddha);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Therephies.this, MainActivity.class);
                startActivity(i);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(Therephies.this, Ayurveda.class);
                startActivity(q);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent w = new Intent(Therephies.this, Naturopathy.class);
                startActivity(w);
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(Therephies.this, Homeopathy.class);
                startActivity(e);
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r = new Intent(Therephies.this, Yoga.class);
                startActivity(r);
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(Therephies.this, Meditation.class);
                startActivity(t);
            }
        });
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y = new Intent(Therephies.this, physio.class);
                startActivity(y);
            }
        });
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(Therephies.this, Psychology.class);
                startActivity(o);
            }
        });
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Therephies.this, Nutrition.class);
                startActivity(p);
            }
        });
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a= new Intent(Therephies.this,Supliments.class);
                startActivity(a);
            }
        });
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s= new Intent(Therephies.this,Herbal.class);
                startActivity(s);
            }
        });
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d= new Intent(Therephies.this,Unani.class);
                startActivity(d);
            }
        });
        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f= new Intent(Therephies.this,Siddha.class);
                startActivity(f);
            }
        });
    }
}