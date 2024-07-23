package com.example.courses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CoursesListActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_list);

    }

    @Override
    public void onClick(View v){

        if (v.getId() == R.id.and_im || v.getId() == R.id.android_btn) {
            Intent i = new Intent(this, AndroidActivity.class);
            startActivity(i);
            finish();
        }

        else if (v.getId() == R.id.ios_pic || v.getId() == R.id.ios_btn) {
            Intent i = new Intent(this, IosActivity.class);
            startActivity(i);
            finish();
        }

        else if (v.getId() == R.id.full_stack_img || v.getId() == R.id.fullStack_btn) {
            Intent i = new Intent(this, FullStackActivity.class);
            startActivity(i);
            finish();
        }
    }
}