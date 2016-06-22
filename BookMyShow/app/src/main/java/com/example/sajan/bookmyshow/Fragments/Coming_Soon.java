package com.example.sajan.bookmyshow.Fragments;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sajan.bookmyshow.MoviesGrid.GridItemObjects;
import com.example.sajan.bookmyshow.MoviesGrid.GridRecyclerViewAdapter;
import com.example.sajan.bookmyshow.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Coming_Soon extends Fragment {


    RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;

    public Coming_Soon() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_coming__soon, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        gridLayoutManager = new GridLayoutManager(getContext(), 3);
        recyclerView.setLayoutManager(gridLayoutManager);

        List<GridItemObjects> gridItemObjectsList = getListItemData();

        GridRecyclerViewAdapter gridRecyclerViewAdapter = new GridRecyclerViewAdapter(gridItemObjectsList, getContext());
        recyclerView.setAdapter(gridRecyclerViewAdapter);
        return rootView;

    }

    private List<GridItemObjects> getListItemData() {
        List<GridItemObjects> listViewItems = new ArrayList<>();
        listViewItems.add(new GridItemObjects("GATSBY", R.drawable.gatsby, "English"));
        listViewItems.add(new GridItemObjects("SCORPION", R.drawable.scorpion, "English"));
        listViewItems.add(new GridItemObjects("GATSBY", R.drawable.gatsby, "English"));
        listViewItems.add(new GridItemObjects("SCORPION", R.drawable.scorpion, "English"));
        listViewItems.add(new GridItemObjects("GATSBY", R.drawable.gatsby, "English"));
        listViewItems.add(new GridItemObjects("SCORPION", R.drawable.scorpion, "English"));
        listViewItems.add(new GridItemObjects("GATSBY", R.drawable.gatsby, "English"));
        listViewItems.add(new GridItemObjects("SCORPION", R.drawable.scorpion, "English"));
        return listViewItems;
    }

}
