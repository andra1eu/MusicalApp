package com.example.andralung.musicalapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.andralung.musicalapp.R;
import com.example.andralung.musicalapp.adapters.AlbumsAdapter;
import com.example.andralung.musicalapp.models.Albums;

import java.util.ArrayList;

public class Artists extends AppCompatActivity implements View.OnClickListener {
    Button buttonHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
        getSupportActionBar().setTitle("Artists");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        buttonHome = (Button) findViewById(R.id.button_home);
        buttonHome.setOnClickListener(this);

        ArrayList<Albums> albumsList = new ArrayList<>();
        albumsList.add(new Albums("Jessie J"));
        albumsList.add(new Albums("Adele"));
        albumsList.add(new Albums("Ed Sheeran"));
        albumsList.add(new Albums("Tom Odell"));
        albumsList.add(new Albums("Paloma Faith"));

        AlbumsAdapter adapter = new AlbumsAdapter(this, albumsList);
        ListView listView = (ListView) findViewById(R.id.list_albums);
        listView.setAdapter(adapter);
    }


    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, Home.class);
        startActivity(i);
    }
}
