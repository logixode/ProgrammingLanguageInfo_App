package com.dicoding.submissiondicodingfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toolbar;

import com.dicoding.submissiondicodingfinal.model.ListBahasa;
import com.dicoding.submissiondicodingfinal.model.varData;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvList;
    private ArrayList<varData>list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Programming Language");
        getSupportActionBar().setSubtitle("Macam - macam Bahasa Pemrograman");

        rvList = (RecyclerView)findViewById(R.id.rv_list);
        rvList.setHasFixedSize(true);

        list.addAll(ListBahasa.getListData());
        showRecyclerList();

//        rvList.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, MainAdapter.class);
//                startActivity(intent);
//            }
//        });

    }

    private void showRecyclerList() {
        rvList.setLayoutManager(new LinearLayoutManager(this));
//        MainAdapter mainAdapter = new MainAdapter(list);
        MainAdapter mainAdapter = new MainAdapter(this);
        MainAdapter.setList(list);
        rvList.setAdapter(mainAdapter);


//        mainAdapter.setOnItemClickCallback(new MainAdapter.OnItemClickCallback() {
//            @Override
//            public void onItemClicked(varData data) {
//                Intent moveIntent = new Intent(MainActivity.this, MainAdapter.class);
//                startActivity(moveIntent);
//            }
//        });
    }

//    private void showSelectedList(varData data){
//
//    }
}
