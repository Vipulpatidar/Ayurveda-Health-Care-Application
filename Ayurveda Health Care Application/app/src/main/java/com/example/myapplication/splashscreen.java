package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.MediaController;
import android.widget.VideoView;

public class splashscreen extends AppCompatActivity {
VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        videoView=findViewById(R.id.SplashScreenImage);


        // Set video path and MediaController
        String videoPath = "android.resource://" + getPackageName() + "/raw/splashscreen";
        videoView.setVideoURI(Uri.parse(videoPath));
        videoView.setMediaController(new MediaController(this));

        // Set OnCompletionListener to start next activity
        videoView.setOnCompletionListener(mp -> {
            new Handler().postDelayed(()-> {
                Intent intent = new Intent(splashscreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            },150);
        });

        // Start video playback
        videoView.start();
    }
}