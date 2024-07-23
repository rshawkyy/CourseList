package com.example.courses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class IosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ios);

        FrameLayout b = findViewById(R.id.buttonBack);
        TextView text = findViewById(R.id.backText);
        ProgressBar progressBar= findViewById(R.id.backProgress);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                progressBar.setVisibility(View.VISIBLE);
                text.setVisibility(View.GONE);


                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        progressBar.setVisibility(View.INVISIBLE);
                        text.setVisibility(View.VISIBLE);

                        startActivity(new Intent(IosActivity.this, CoursesListActivity.class));

                    }
                },600);
            }
        });

    }
}