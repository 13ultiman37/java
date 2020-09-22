package ru.mirea.ikbo1319.pr5.z2;
import java.lang.Math;

public class Circle extends Shape{
public double r;
public double perimetr;
public double area;

    public Circle(){}

    public Circle(String color, boolean filled ,double r) {
        super(color, filled);
        setR(r);
    }


    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }


    public double getPerimetr() {
        return 2*Math.PI*r;
    }

    public double getArea() {
        return Math.PI*r*r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", perimetr=" + getPerimetr() +
                ", area=" + getArea() +
                ", color= " + getColor() +
                ", filled= " + isFilled() +
                '}';
    }
}
