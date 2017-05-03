package com.example.iveci.mad7;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by iveci on 2017-04-27.
 */

public class GridAdapter extends BaseAdapter {
    Context context;
    ArrayList<Fruit> fruit;
    Boolean visible = false;

    public GridAdapter(Context context, ArrayList<Fruit> fruit) {
        this.context = context;
        this.fruit = fruit;
    }

    @Override
    public int getCount() {
        return fruit.size();
    }

    @Override
    public Object getItem(int position) {
        return fruit.get(position);
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
        notifyDataSetChanged();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = new GridItem(context);
        }
        ((GridItem)convertView).setData(fruit.get(position), visible);
        return convertView;
    }
}
