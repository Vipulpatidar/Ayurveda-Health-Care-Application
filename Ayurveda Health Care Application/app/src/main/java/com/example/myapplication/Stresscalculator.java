package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Stresscalculator extends AppCompatActivity {

    private SeekBar[] seekBars = new SeekBar[12];
    private TextView averageTextView;


    Button btn;
    TextView tv;

    private int totalProgress = 0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stresscalculator);
        // initiate  views
        seekBars[0] = findViewById(R.id.seekbar1);
        seekBars[1] = findViewById(R.id.seekbar33);
        seekBars[2] = findViewById(R.id.seekbar12);
        seekBars[3] = findViewById(R.id.seekbar3);
        seekBars[4] = findViewById(R.id.seekbar2);
        seekBars[5] = findViewById(R.id.seekbar4);
        seekBars[6] = findViewById(R.id.seekbar5);
        seekBars[7] = findViewById(R.id.seekbar7);
        seekBars[8] = findViewById(R.id.seekbar8);
        seekBars[9] = findViewById(R.id.seekbar9);
        seekBars[10] = findViewById(R.id.seekbar10);
        seekBars[11] = findViewById(R.id.seekbar12);

        tv = findViewById(R.id.result);
        averageTextView = findViewById(R.id.result);



// Set up the OnSeekBarChangeListener for each SeekBar
        for (SeekBar seekBar : seekBars) {
            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    // Call a method to calculate and update the average
                    updateAverage();
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }

                // Implement other methods of OnSeekBarChangeListener if needed
            });
            

}}

    private void updateAverage() {
        int totalProgress = 0;
        for (SeekBar seekBar : seekBars) {
            totalProgress += seekBar.getProgress();
        }
        float average = (float) totalProgress / seekBars.length;
        averageTextView.setText(String.format("%.2f the average is", average));
    }}
