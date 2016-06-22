package com.example.sajan.bookmyshow.MoviesGrid;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sajan.bookmyshow.R;

/**
 * Created by Sajan on 15-Jun-16.
 */
public class GridViewHolder extends RecyclerView.ViewHolder {


    public TextView txt_movie_name;
    public ImageView img_movie_name;
    public TextView txt_movie_desc;

    public GridViewHolder(View itemView) {
        super(itemView);

        txt_movie_name = (TextView) itemView.findViewById(R.id.movie_name);
        img_movie_name = (ImageView) itemView.findViewById(R.id.movie_photo);
        txt_movie_desc = (TextView) itemView.findViewById(R.id.movie_desc);
    }
}
