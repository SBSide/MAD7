package com.example.iveci.mad7;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by iveci on 2017-04-27.
 */

public class AddFruit extends LinearLayout implements View.OnClickListener{
    int imgno = 0;
    int pos = 0;
    int price = 0;
    EditText e1;
    ImageView i1;
    Button bn, ba;

    public AddFruit(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    void init(Context context){
        LayoutInflater.from(context).inflate(R.layout.fruitadd,this);
        e1 = (EditText) findViewById(R.id.f_name);
        i1 = (ImageView) findViewById(R.id.image1);
        bn = (Button) findViewById(R.id.b_next);
        ba = (Button) findViewById(R.id.b_add);
        bn.setOnClickListener(this);
        ba.setOnClickListener(this);
    }

    public void set(String fname, int img, Boolean modmode, int position, int pri) {
        e1.setText(fname);
        imgno = img;
        pos = position;
        price = pri;
        i1.setImageResource(imgno);
        ba.setText(modmode ? "M" : "ADD");
    }

    @Override
    public void onClick(View v) {
        if (v == bn) {
            if (imgno == Fruit.imglist.length - 1) {
                imgno = -1;
                i1.setImageResource(Fruit.imglist[++imgno]);
            }
            else i1.setImageResource(Fruit.imglist[++imgno]);
        }
        else {
            onAdd.onAdd(e1.getText().toString(), imgno);
        }
    }

    interface OnAdder {
        void onAdd(String name, int imgno);
    }

    public OnAdder onAdd;

    public void setOnAdd(OnAdder onAdd){
        this.onAdd = onAdd;
    }


}
