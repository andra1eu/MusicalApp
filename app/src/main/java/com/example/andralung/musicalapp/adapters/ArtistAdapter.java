package com.example.andralung.musicalapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.andralung.musicalapp.models.Artist;
import com.example.andralung.musicalapp.activities.NowPlaying;
import com.example.andralung.musicalapp.R;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<Artist> implements View.OnClickListener {

    public ArtistAdapter(@NonNull Context context, ArrayList<Artist> wordsList) {
        super(context, 0, wordsList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Artist artist = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_my_playlist, parent, false);
        }

        TextView song = (TextView) convertView.findViewById(R.id.my_song);
        ImageView buttonPlay = (ImageView) convertView.findViewById(R.id.image_play);

        song.setText(artist.getMyArtist());
        buttonPlay.setImageResource(artist.getMyIcon());

        song.setOnClickListener(this);
        song.setTag(position);


        return convertView;
    }


    @Override
    public void onClick(View v) {

        Intent i = new Intent(getContext(), NowPlaying.class);
        getContext().startActivity(i);
    }
}
