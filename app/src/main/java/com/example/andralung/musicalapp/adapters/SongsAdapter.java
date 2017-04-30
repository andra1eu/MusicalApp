package com.example.andralung.musicalapp.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;

import com.example.andralung.musicalapp.R;
import com.example.andralung.musicalapp.models.SongsToAdd;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<SongsToAdd> {


    public SongsAdapter(@NonNull Context context, ArrayList<SongsToAdd> songsToAdd) {
        super(context, 0, songsToAdd);

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        SongsToAdd songs = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_add_to_playlist, parent, false);
        }

        CheckBox checkBox = (CheckBox)convertView.findViewById(R.id.check_box_songs);
        checkBox.setText(songs.getSongsToAddInPlaylist());

        return convertView;
    }
}
