package com.example.sajan.bookmyshow.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sajan.bookmyshow.MainActivity;
import com.example.sajan.bookmyshow.MoviesGrid.GridItemObjects;
import com.example.sajan.bookmyshow.MoviesGrid.GridRecyclerViewAdapter;
import com.example.sajan.bookmyshow.Movies_Details;
import com.example.sajan.bookmyshow.R;
import com.example.sajan.bookmyshow.Rest.Model.Response.MovieDetails;
import com.example.sajan.bookmyshow.Rest.Model.Response.ProductionCompany;
import com.example.sajan.bookmyshow.Rest.RetrofitManager;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Running_Movies extends Fragment {


    private static final String TAG = MainActivity.class.getSimpleName();
    RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;


    RetrofitManager retrofitManager = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_running__movies, container, false);

        //register the retrofit for network call
        retrofitManager = RetrofitManager.getInstance();
        Log.i(TAG, "onCreateView: ");

        retrofitManager.getMoviesInfo("500", "fd0e089aa60d9b0c946e70c99935da88", new Callback<MovieDetails>() {
            @Override
            public void onResponse(Call<MovieDetails> call, Response<MovieDetails> response) {
                Log.i("success", "onResponse: ");
                if (response.code()==200){
                    Log.i("success", "onResponse: "+response.body().getOriginal_title());
                    Log.i("success", "onResponse: "+response.body().getAdult());
                    Log.i(TAG, "onResponse: "+response.body().getProductionCompanyList());


//                    ArrayList<MovieDetails> movieDetailArrayList = response.body();

                    for(ProductionCompany productionCompany:response.body().getProductionCompanyList()){
                        Log.i("success", "onResponse: "+productionCompany.getName());
                    }
                }
            }

            @Override
            public void onFailure(Call<MovieDetails> call, Throwable t) {
                Log.i("Failure", "onFailure: ");
                Log.i("Failure", "onFailure: " + t.getLocalizedMessage());
            }
        });

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        gridLayoutManager = new GridLayoutManager(getContext(),3);
        recyclerView.setLayoutManager(gridLayoutManager);

        List<GridItemObjects> gridItemObjectsList = getListItemData();

        GridRecyclerViewAdapter gridRecyclerViewAdapter = new GridRecyclerViewAdapter(gridItemObjectsList, getContext());
        recyclerView.setAdapter(gridRecyclerViewAdapter);
        return rootView;

    }

    private List<GridItemObjects> getListItemData() {
        List<GridItemObjects> listViewItems = new ArrayList<>();
     /*   listViewItems.add(new GridItemObjects("Spectre", R.drawable.spectre,"English"));
        listViewItems.add(new GridItemObjects("Dilwale", R.drawable.dilwale,"Hindi"));
        listViewItems.add(new GridItemObjects("Bajirao Mastani", R.drawable.bajirao_mastani, "Hindi"));
        listViewItems.add(new GridItemObjects("Bahubali", R.drawable.bahubali, "Hindi"));
        listViewItems.add(new GridItemObjects("BAAGHI", R.drawable.baaghi,"Hindi"));
        listViewItems.add(new GridItemObjects("HOUSEFUL 3", R.drawable.houseful3,"Hindi"));
        listViewItems.add(new GridItemObjects("SANAM RE", R.drawable.sanam_re,"Hindi"));
        listViewItems.add(new GridItemObjects("Dilwale", R.drawable.dilwale,"Hindi"));*/






        return listViewItems;
    }

}