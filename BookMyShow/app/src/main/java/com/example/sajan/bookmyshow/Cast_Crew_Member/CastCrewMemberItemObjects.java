package com.example.sajan.bookmyshow.Cast_Crew_Member;

/**
 * Created by Sajan on 20-Jun-16.
 */
public class CastCrewMemberItemObjects {
    private int photo;
    private String name;

    public CastCrewMemberItemObjects(int photo, String name) {
        this.photo = photo;
        this.name = name;
    }

    public int getPhoto() {

        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
