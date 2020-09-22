package ru.mirea.ikbo1319.pr6.z2;

import ru.mirea.ikbo1319.pr5.z2.Rectangle;
import ru.mirea.ikbo1319.pr6.z1.MovablePoint;
import ru.mirea.ikbo1319.pr6.z1.MovableInterface;

public class MovableRectangle extends Rectangle implements MovableInterface {
    private MovablePoint rccenter;
    public MovableRectangle(String color, boolean filled, double width, double length, double x, double y){
        super(color, filled, width, length);
        rccenter = new MovablePoint(x, y);
    }

    @Override
    public void move(double x, double y)
    {
        rccenter.move(x,y);
    }

    @Override
    public String toString() {
        return rccenter.toString();
    }
}
