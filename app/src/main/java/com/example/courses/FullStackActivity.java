package com.example.courses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class FullStackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_stack);

        FrameLayout full = findViewById(R.id.backButtonFull);
        TextView textFull = findViewById(R.id.textBackFull);
        ProgressBar progressBarFull= findViewById(R.id.backProgressFull);

        full.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                progressBarFull.setVisibility(View.VISIBLE);
                textFull.setVisibility(View.GONE);


                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        progressBarFull.setVisibility(View.INVISIBLE);
                        textFull.setVisibility(View.VISIBLE);

                        startActivity(new Intent(FullStackActivity.this, CoursesListActivity.class));

                    }
                },600);
            }
        });

    }
}