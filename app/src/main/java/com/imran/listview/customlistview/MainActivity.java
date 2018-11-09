package com.imran.listview.customlistview;

   import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ListView listView;

    String[] nameid={"Fowjael Ahamed","Istiak Ahamed",
            "Abu kaiser","Rakib Hossain",
            "Bayazid Miah","Ashraful Islam"};

    String[] sectionid={"F","F","F","F","F","F"};
    String[] idid={"161-15-7045","152-15-5600",
            "161-15-6759","161-15-6802",
            "161-15-7063","161-15-7100"};

    Integer[] imageid={R.drawable.imranbg,R.drawable.istiakbg,
            R.drawable.kaiserbg,R.drawable.rakibbg,
            R.drawable.bayzidbg,R.drawable.ashbg};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listview);
        MyListAdapter adapter=new MyListAdapter(this,imageid,nameid,sectionid,idid);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){

                }
            }
        });

    }
}
