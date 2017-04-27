package com.example.iveci.mad7;

/**
 * Created by iveci on 2017-04-27.
 */

public class Fruit {
    String name;
    int imgno;

    public Fruit(String name, int imgno) {
        this.name = name;
        this.imgno = imgno;
    }

    @Override
    public String toString() {
        return name;
    }
}
