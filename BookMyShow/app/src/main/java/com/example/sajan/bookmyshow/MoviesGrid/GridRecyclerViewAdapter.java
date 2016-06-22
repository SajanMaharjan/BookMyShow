package com.example.sajan.bookmyshow.MoviesGrid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sajan.bookmyshow.Movies;
import com.example.sajan.bookmyshow.R;

import java.util.List;

/**
 * Created by Sajan on 15-Jun-16.
 */
public class GridRecyclerViewAdapter extends RecyclerView.Adapter<GridViewHolder> {


    private List<GridItemObjects> itemList;
    private Context context;

    public GridRecyclerViewAdapter(List<GridItemObjects> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public GridViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_list,null);
        GridViewHolder gridViewHolder = new GridViewHolder(layoutView);
        return gridViewHolder;
    }

    @Override
    public void onBindViewHolder(GridViewHolder holder, int position) {
        Log.i("Language",itemList.get(position).getLanguage());
        holder.txt_movie_name.setText(itemList.get(position).getName());
        holder.img_movie_name.setImageResource(itemList.get(position).getPhoto());
        holder.txt_movie_desc.setText(itemList.get(position).getLanguage());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
