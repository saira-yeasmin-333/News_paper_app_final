package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class binodon extends AppCompatActivity {

    private Myadapter myadapter;
    private RecyclerView recyclerView;
    int[] flag;
    private String[] papernames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_international);

        setTitle("Entertainment");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        flag=new int[]{R.drawable.prothomalo,R.drawable.bdprotidin,R.drawable.jatiyo21,R.drawable.kalerkontho,R.drawable.noyadigonto,
                R.drawable.amarsongbad,R.drawable.protidinersongbad,R.drawable.jugantor,R.drawable.manobjomin,
                R.drawable.amadersomoy,R.drawable.somokal,R.drawable.manobkontho};
        papernames = getResources().getStringArray(R.array.Binodon1);


        recyclerView=(RecyclerView)findViewById(R.id.zillaWiseRecyclerView);

        myadapter=new Myadapter(this, flag, papernames, 65);
        recyclerView.setAdapter(myadapter);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return false;
        }
    }


}
