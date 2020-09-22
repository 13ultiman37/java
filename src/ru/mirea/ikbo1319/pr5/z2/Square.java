package ru.mirea.ikbo1319.pr5.z2;

public class Square extends Shape{

    public double side;

    public Square(){}

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimetr() {
        return side*4;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", perimetr=" + getPerimetr() +
                ", area=" + getArea() +
                ", color= " + getColor() +
                ", filled= " + isFilled() +
                '}';
    }
}
