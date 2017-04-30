package com.example.andralung.musicalapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;

import com.example.andralung.musicalapp.activities.AddToPlaylist;
import com.example.andralung.musicalapp.models.Albums;
import com.example.andralung.musicalapp.R;

import java.util.ArrayList;

public class AlbumsAdapter extends ArrayAdapter<Albums> implements View.OnClickListener{


    public AlbumsAdapter(@NonNull Context context, ArrayList<Albums> albumsList) {
        super(context, 0, albumsList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Albums albums = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_my_albums, parent, false);
        }

        RadioButton radioButton = (RadioButton) convertView.findViewById(R.id.radioButtonArtist);
        radioButton.setText(albums.getAlbums());
        radioButton.setOnClickListener(this);
        radioButton.getTag(position);

        return  convertView;
    }





    @Override
    public void onClick(View v) {

        Intent i = new Intent(getContext(),AddToPlaylist.class);
        getContext().startActivity(i);
    }
}
