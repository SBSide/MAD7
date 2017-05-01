package com.example.iveci.mad7;

import android.content.Context;
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
