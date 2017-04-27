package com.example.iveci.mad7;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by iveci on 2017-04-27.
 */

public class AddFruit extends LinearLayout {
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
    }
}
