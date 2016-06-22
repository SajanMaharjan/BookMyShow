package com.example.sajan.bookmyshow.MoviesGrid;

/**
 * Created by Sajan on 15-Jun-16.
 */
public class GridItemObjects {

    private String name;
    private int photo;
    private String language;


    public GridItemObjects(String name, int photo, String language) {
        this.name = name;
        this.photo = photo;
        this.language = language;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}

