package com.example.andralung.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NowPlaying extends AppCompatActivity implements View.OnClickListener {

    Button buttonPlaylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        getSupportActionBar().setTitle("Now Playing");

        buttonPlaylist = (Button)findViewById(R.id.button_playlist);
        buttonPlaylist.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, MyPlaylist.class);
        startActivity(i);
    }
}
