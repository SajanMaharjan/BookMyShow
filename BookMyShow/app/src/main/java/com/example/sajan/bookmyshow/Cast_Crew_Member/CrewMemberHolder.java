package com.example.sajan.bookmyshow.Cast_Crew_Member;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sajan.bookmyshow.R;



/**
 * Created by Sajan on 20-Jun-16.
 */
public class CrewMemberHolder extends RecyclerView.ViewHolder{

    public TextView member_name;
    public ImageView member_photo;

    public CrewMemberHolder(View itemView) {
        super(itemView);

        member_photo = (ImageView) itemView.findViewById(R.id.circleView_member);
        member_name = (TextView) itemView.findViewById(R.id.crew_name);
    }
}
