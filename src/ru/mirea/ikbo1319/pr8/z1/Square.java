package ru.mirea.ikbo1319.pr8.z1;

import java.awt.*;
import java.util.Random;

public class Square extends Shape{
    private int side = 200;
    @Override
    public int getX(){
        Random rand = new Random();
        x = rand.nextInt(700);
        return x;
    }

    @Override
    public int getY(){
        Random rand = new Random();
        y = rand.nextInt(700);
        return y;
    }

    public int getSide() {
        return side;
    }

    @Override
    public Color getRandom() {
        Random rand = new Random();
        r = rand.nextInt(256);
        g = rand.nextInt(256);
        b = rand.nextInt(256);
        Color color = new Color(r, g, b);
        return color;
    }
}
