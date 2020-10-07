package ru.mirea.ikbo1319.pr8.z1;

import java.awt.*;
import java.util.Random;

public class Arc extends Shape{
   private int arc = 90;
   private int startAngle = 170;
   private int width = 100;
   private int height = 100;

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

    public int getArc() {
        return arc;
    }

    public int getStartAngle() {
        return startAngle;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
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
