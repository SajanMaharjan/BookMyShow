package com.example.sajan.bookmyshow.Cast_Crew_Member;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sajan.bookmyshow.MoviesGrid.GridItemObjects;
import com.example.sajan.bookmyshow.R;

import java.util.List;

/**
 * Created by Sajan on 20-Jun-16.
 */
public class CrewMemberViewAdapter extends RecyclerView.Adapter<CrewMemberHolder> {

    private List<GridItemObjects> itemList;
    private Context context;





    @Override
    public CrewMemberHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View memberView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cast_n_crew_members,null);
        CrewMemberHolder crewMemberHolder = new CrewMemberHolder(memberView);
        return crewMemberHolder;
    }

    @Override
    public void onBindViewHolder(CrewMemberHolder holder, int position) {

        holder.member_name.setText(itemList.get(position).getName());
        holder.member_photo.setImageResource(itemList.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
