package ru.mirea.ikbo1319.pr6.z1;

import ru.mirea.ikbo1319.pr5.z2.Circle;

public class MovableCircle extends Circle implements MovableInterface{
    private MovablePoint center;

    public MovableCircle(String color, boolean filled, double r, double x, double y) {
        super(color, filled, r);
        center = new MovablePoint(x, y)  ;
    }

    @Override
    public void move (double x, double y){
        center.move(x,y);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "center=" + center +
                '}';
    }
}
