package com.gamertickky.foodui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavBar);
        bottomNavigationView.setSelectedItemId(R.id.menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                return false;
            }
        });

        //horizontal
        RecyclerView horiRecView = findViewById(R.id.horizontalRecView);
        List<horizontalModel> horizontalModelList  = new ArrayList<>();
        horizontalModelList.add(new horizontalModel("Starter",R.color.colorAccent));
        horizontalModelList.add(new horizontalModel("All",R.color.colorPrimary));
        horizontalModelList.add(new horizontalModel("Biryani", R.color.colorAccent));
        horizontalModelList.add(new horizontalModel("Burgur", R.color.colorAccent));
        horizontalModelList.add(new horizontalModel("Pizza", R.color.colorAccent));



        HorizontalAdapter horizontalAdapter= new HorizontalAdapter(horizontalModelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        horiRecView.setLayoutManager(linearLayoutManager);
        horiRecView.setAdapter(horizontalAdapter);
        horizontalAdapter.notifyDataSetChanged();
        //horizontal

        //grid
        RecyclerView verticalRecView = findViewById(R.id.verticalRecView);
        List<VerticalModel>verticalModelList = new ArrayList<>();
        verticalModelList.add(new VerticalModel("Chilli Potato","Rs 30.0",R.drawable.chicken,"(18)"));
        verticalModelList.add(new VerticalModel("Paneer Tikka","Rs 100.0",R.drawable.chickensauce,"(25)"));
        verticalModelList.add(new VerticalModel("Chicken","Rs 230.0",R.drawable.chickenn,"(67)"));
        verticalModelList.add(new VerticalModel("Pasta","Rs 130.0",R.drawable.mutton,"(29)"));



        VerticalAdapter verticalAdapter = new VerticalAdapter(verticalModelList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        gridLayoutManager.setSpanCount(2);
        verticalRecView.setLayoutManager(gridLayoutManager);
        verticalRecView.setAdapter(verticalAdapter);
        verticalAdapter.notifyDataSetChanged();
        //grid
    }


}