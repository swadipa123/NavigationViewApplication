package com.example.splashscreen_logo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,activity_splash.class);
                startActivity(intent);
                finish();  //distroys activity object (when click on back then open home screen not open splashscreen )

            }
        },2500);// after 2.5 sec next activity open
    }
}