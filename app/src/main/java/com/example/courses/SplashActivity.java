package com.example.courses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startMainActivity();
            }
        },5000);
    }

    private void startMainActivity() {

        Intent intent = new Intent(this, CoursesListActivity.class);
        startActivity(intent);
        finish();
    }

}