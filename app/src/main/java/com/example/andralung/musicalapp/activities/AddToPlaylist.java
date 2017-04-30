package com.example.andralung.musicalapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.andralung.musicalapp.R;
import com.example.andralung.musicalapp.adapters.SongsAdapter;
import com.example.andralung.musicalapp.models.SongsToAdd;

import java.util.ArrayList;

public class AddToPlaylist extends AppCompatActivity implements View.OnClickListener {

    Button artistButton;
    Button playlistButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_playlist);
        getSupportActionBar().setTitle("Add to playlist");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        artistButton = (Button) findViewById(R.id.button_go_artists);
        playlistButton = (Button) findViewById(R.id.button_go_playlist);

        artistButton.setOnClickListener(this);
        playlistButton.setOnClickListener(this);


        ArrayList<SongsToAdd> songsToAdd = new ArrayList<>();
        songsToAdd.add(new SongsToAdd("Domino"));
        songsToAdd.add(new SongsToAdd("Who's laughing now"));
        songsToAdd.add(new SongsToAdd("Who you are"));
        songsToAdd.add(new SongsToAdd("Price tag"));
        songsToAdd.add(new SongsToAdd("Flash light"));

        SongsAdapter adapter = new SongsAdapter(this, songsToAdd);
        ListView listView = (ListView) findViewById(R.id.list_add_to_playlist);
        listView.setAdapter(adapter);
    }


    public void onPlaylistClicked(View view){
        Intent i = new Intent(this, MyPlaylist.class);
        startActivity(i);
    }

    @Override
    public void onClick(View v) {
        Intent i = null;

        switch (v.getId()){
            case R.id.button_go_artists:
                i = new Intent(this, Artists.class);
                break;
            case R.id.button_go_playlist:
                i = new Intent(this, MyPlaylist.class);
                break;
        }
        startActivity(i);
    }
}
