package com.example.iveci.mad7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ArrayList<Fruit> fruit = new ArrayList<>();
    AutoCompleteTextView adt;
    GridAdapter adapter;
    GridView gridView;
    AddFruit addFruit;
    CheckBox c1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("What is your favorite fruit?");
        adt = (AutoCompleteTextView) findViewById(R.id.f_name);
        adt.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, Fruit.namelist));
        gridView = (GridView) findViewById(R.id.grid);
        c1 = (CheckBox) findViewById(R.id.checkprice);
        fruit.add(new Fruit("아보카도", 0, "5000"));
        fruit.add(new Fruit("바나나", 1, "1000"));
        fruit.add(new Fruit("체리", 2, "2000"));
        fruit.add(new Fruit("크랜베리", 3, "3000"));
        adapter = new GridAdapter(this, fruit);
        gridView.setAdapter(adapter);
        addFruit = (AddFruit) findViewById(R.id.add);
        addFruit.setOnAdd(new AddFruit.OnAdder() {
            @Override
            public void onAdd(String name, int imgno, String price) {
                if (addFruit.ba.getText().toString().equals("M")) {
                    fruit.get(addFruit.pos).setName(name);
                    fruit.get(addFruit.pos).setImgno(imgno);
                    fruit.get(addFruit.pos).setPrice(price);
                    Toast.makeText(getApplicationContext(),"정보가 수정되었습니다.",Toast.LENGTH_SHORT).show();
                }
                else {
                    fruit.add(new Fruit(name, imgno, price));
                    Toast.makeText(getApplicationContext(),"과일이 추가되었습니다.",Toast.LENGTH_SHORT).show();
                }
                addFruit.set("", "", 0, false, 0);
                adapter.notifyDataSetChanged();
            }
        });
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit img = fruit.get(position);
                addFruit.set(img.getName(false), img.getPrice(), img.getImgno(), true, position);
            }
        });
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                adapter.setVisible(isChecked);
            }
        });
    }
}
