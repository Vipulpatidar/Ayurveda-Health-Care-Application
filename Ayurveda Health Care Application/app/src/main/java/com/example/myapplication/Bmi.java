package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bmi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        EditText editTextweight=findViewById(R.id.etWeight);
        EditText editTextheight=findViewById(R.id.etHeight);
        Button button=findViewById(R.id.calculate_btn);
        TextView textView=findViewById(R.id.result);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float height=Float.parseFloat(String.valueOf(editTextheight.getText()))/100;
                float weight=Float.parseFloat(String.valueOf(editTextweight.getText()));
                float bmi=weight/(height*height);
                textView.setText(String.valueOf(bmi));
            }
        });


    }
}