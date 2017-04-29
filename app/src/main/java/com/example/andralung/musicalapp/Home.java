package com.example.andralung.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Home extends AppCompatActivity implements View.OnClickListener {

    TextView playlit;
    TextView artists;
    TextView store;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Home");

        playlit = (TextView) findViewById(R.id.my_playlist);
        artists = (TextView) findViewById(R.id.artists);
        store = (TextView) findViewById(R.id.store);
        playlit.setOnClickListener(this);
        artists.setOnClickListener(this);
        store.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        Intent i =null;
        switch (v.getId()){
            case R.id.my_playlist:
               i = new Intent(this, MyPlaylist.class);
                break;
            case R.id.artists:
                i = new Intent(this,Artists.class);
                break;
            case R.id.store:
                i = new Intent(this, Store.class);
                break;
        }
        startActivity(i);

    }
}
