package com.imran.listview.customlistview;

import android.app.Activity;
 import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyListAdapter extends ArrayAdapter<String> {
    Activity context;
    Integer[] imageid;
    String[] nameid;
    String[] sectionid;
    String[] idid;

      public MyListAdapter(Activity context, Integer[] imageid,String[] nameid, String[] sectionid, String[] idid) {
        super(context, R.layout.mylist, nameid);
        this.context = context;
        this.imageid = imageid;
        this.nameid=nameid;
        this.sectionid = sectionid;
        this.idid = idid;
    }

    @NonNull
    @Override

    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater layoutInflater= context.getLayoutInflater();
        View view=layoutInflater.inflate(R.layout.mylist,null,true);

        ImageView imageView=view.findViewById(R.id.imageid);
        TextView nameView=view.findViewById(R.id.nameid);
        TextView sectionView=view.findViewById(R.id.sectionid);
        TextView idView=view.findViewById(R.id.idid);

        nameView.setText(nameid[position]);


        imageView.setImageResource(imageid[position]);
        sectionView.setText( "Section: "+sectionid[position]);
        idView.setText("Id: "+idid[position]);
        return view;
    }
}
