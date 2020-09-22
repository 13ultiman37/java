package ru.mirea.ikbo1319.pr5.z2;

public class Rectangle extends Shape {
    public double width;
    public double length;

    public Rectangle(){}

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimetr() {
        return 2*(width + length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", perimetr=" + getPerimetr() +
                ", area=" + getArea() +
                ", color= " + getColor() +
                ", filled= " + isFilled() +
                '}';
    }
}
