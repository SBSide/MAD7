package com.example.iveci.mad7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

/**
 * Created by iveci on 2017-04-27.
 */

public class SpinnerAdapter extends BaseAdapter {
    String fruit[];
    Context context;

    public SpinnerAdapter(Context context, String[] fruit) {
        this.fruit = fruit;
        this.context = context;
    }

    @Override
    public int getCount() {
        return fruit.length;
    }

    @Override
    public Object getItem(int position) {
        return fruit[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.cspinner,null);
        }
        final TextView t1 = (TextView) convertView.findViewById(R.id.textsp);
        final CheckBox c1 = (CheckBox) convertView.findViewById(R.id.checkBox);
        t1.setText(fruit[position]);
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String msg = "선택됨.";
                if (!isChecked) msg = "선택안됨.";
            }
        });
        return convertView;
    }
}
