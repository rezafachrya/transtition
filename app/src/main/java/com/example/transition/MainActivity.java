package com.example.transition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextPage(View view) {
        Intent i =  new Intent();
        i.setClass(this, LoginActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_up, R.anim.stay);
    }
}