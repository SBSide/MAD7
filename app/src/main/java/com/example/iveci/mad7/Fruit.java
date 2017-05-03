package com.example.iveci.mad7;

/**
 * Created by iveci on 2017-04-27.
 */

public class Fruit {
    public static String namelist[] = {"아보카도", "바나나", "체리", "크랜베리", "포도", "키위", "오렌지", "수박"};
    public static int imglist[] = {R.drawable.abocado, R.drawable.banana, R.drawable.cherry,
            R.drawable.cranberry, R.drawable.grape, R.drawable.kiwi, R.drawable.orange, R.drawable.watermelon};
    private String name;
    private int imgno = 0;
    private String price;

    public Fruit(String name, int imgno, String price) {
        this.name = name;
        this.imgno = imgno;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImgno(int imgno) {
        this.imgno = imgno;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName(boolean check) {
        if (check) return name + " / " + price;
        else return name;
    }

    public int getImgno() {
        return imgno;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }
}
