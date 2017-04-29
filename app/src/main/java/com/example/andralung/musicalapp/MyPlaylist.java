package com.example.andralung.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MyPlaylist extends AppCompatActivity implements View.OnClickListener{

    Button artists;
    Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_playlist);
        getSupportActionBar().setTitle("My Playlist");

        artists = (Button) findViewById(R.id.button_artists);
        home = (Button) findViewById(R.id.button_home);

        artists.setOnClickListener(this);
        home.setOnClickListener(this);


        ArrayList<Artist> artists = new ArrayList<>();
        artists.add(new Artist("Adele - Someone like you", R.drawable.ic_play_circle_filled_black_24dp));
        artists.add(new Artist("Ed Sheeran - One", R.drawable.ic_play_circle_filled_black_24dp));
        artists.add(new Artist("Jessie J - Domino", R.drawable.ic_play_circle_filled_black_24dp));
        artists.add(new Artist("Ed Sheeran - Perfect", R.drawable.ic_play_circle_filled_black_24dp));
        artists.add(new Artist("Lana Del Ray - Love", R.drawable.ic_play_circle_filled_black_24dp));

        ArtistAdapter adapter = new ArtistAdapter(this, artists);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }


    @Override
    public void onClick(View v) {
        Intent i = null;
        switch (v.getId()){
            case R.id.button_artists:
                i= new Intent(this, Artists.class);
                break;
            case R.id.button_home:
                i= new Intent(this, Home.class);
                break;
        }
        startActivity(i);
    }
}
