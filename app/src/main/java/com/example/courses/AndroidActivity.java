package com.example.courses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class AndroidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);

        FrameLayout frame = findViewById(R.id.backButton);
        TextView text = findViewById(R.id.textBack);
        ProgressBar progress = findViewById(R.id.backProg);


        frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                progress.setVisibility(View.VISIBLE);
                text.setVisibility(View.GONE);


                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        progress.setVisibility(View.INVISIBLE);
                        text.setVisibility(View.VISIBLE);

                        startActivity(new Intent(AndroidActivity.this, CoursesListActivity.class));

                    }
                },600);
            }
        });
    }
}