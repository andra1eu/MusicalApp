package com.example.andralung.musicalapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.andralung.musicalapp.R;

public class Store extends AppCompatActivity implements View.OnClickListener {
    Button buttonHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        getSupportActionBar().setTitle("Store");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        buttonHome = (Button) findViewById(R.id.button_home);
        buttonHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, Home.class);
        startActivity(i);
    }
}
