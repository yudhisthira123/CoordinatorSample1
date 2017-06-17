package com.example.yudhisthira.coordinatorsample1;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolBar);
        toolbar.setTitle("Its AppBarLayout");

        CollapsingToolbarLayout layout = (CollapsingToolbarLayout)findViewById(R.id.collapsingToolBar);
        layout.setTitle("Collapsing");

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);


        List<Item> itemList = new ArrayList<>();

        itemList.add(new Item("", "name1", "address1"));
        itemList.add(new Item("", "name2", "address2"));
        itemList.add(new Item("", "name3", "address3"));
        itemList.add(new Item("", "name4", "address4"));
        itemList.add(new Item("", "name5", "address5"));
        itemList.add(new Item("", "name6", "address6"));
        itemList.add(new Item("", "name7", "address7"));
        itemList.add(new Item("", "name8", "address8"));
        itemList.add(new Item("", "name9", "address9"));
        itemList.add(new Item("", "name10", "address10"));


        recyclerView.setAdapter(new ListAdapter(this, itemList));
    }
}
