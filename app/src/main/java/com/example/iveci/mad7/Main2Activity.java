package com.example.iveci.mad7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ArrayList<Fruit> fruit = new ArrayList<>();
    GridAdapter adapter;
    GridView gridView;
    int imglist[] = {R.drawable.abocado,R.drawable.banana, R.drawable.cherry,
                     R.drawable.cranberry, R.drawable.grape, R.drawable.kiwi};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        gridView = (GridView) findViewById(R.id.grid);
        fruit.add(new Fruit("아보카도", imglist[0]));
        fruit.add(new Fruit("바나나", imglist[1]));
        fruit.add(new Fruit("체리", imglist[2]));
        fruit.add(new Fruit("크랜베리", imglist[3]));
        adapter = new GridAdapter(this, fruit);
        gridView.setAdapter(adapter);
    }
}
