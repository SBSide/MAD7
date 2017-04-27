package com.example.iveci.mad7;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by iveci on 2017-04-27.
 */

public class GridItem extends LinearLayout {
    TextView t1 = (TextView) findViewById(R.id.tname1);
    ImageView i1 = (ImageView) findViewById(R.id.img1);
    public GridItem(Context context) {
        super(context);
        init(context);
    }

    public void init(Context context){
        LayoutInflater.from(context).inflate(R.layout.gray,this);
        t1 = (TextView) findViewById(R.id.tname1);
        i1 = (ImageView) findViewById(R.id.img1);
    }

    public void setData(Fruit one) {
        t1.setText(one.name);
        i1.setImageResource(one.imgno);
    }
}
