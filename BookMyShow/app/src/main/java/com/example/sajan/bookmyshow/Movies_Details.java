package com.example.sajan.bookmyshow;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.sajan.bookmyshow.Cast_Crew_Member.CastCrewMemberItemObjects;
import com.example.sajan.bookmyshow.Cast_Crew_Member.CrewMemberViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class Movies_Details extends Activity {

    RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies__details);

        //Inflate the layout for the recyclerView
        View rootView = getLayoutInflater().inflate(R.layout.cast_n_crew_members,null);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.crewRecyclerView);
        recyclerView.hasFixedSize();

        gridLayoutManager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(gridLayoutManager);

        List<CastCrewMemberItemObjects> castCrewMemberItemObjectsList = getListItemMembers();

        CrewMemberViewAdapter crewMemberViewAdapter = new CrewMemberViewAdapter();



    }

    private List<CastCrewMemberItemObjects> getListItemMembers() {
        List<CastCrewMemberItemObjects> listMemberItems = new ArrayList<>();

  //      listMemberItems.add(new CastCrewMemberItemObjects(""));


        return listMemberItems;
    }
}
