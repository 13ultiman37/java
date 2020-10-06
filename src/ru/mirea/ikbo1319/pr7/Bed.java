package ru.mirea.ikbo1319.pr7;

public class Bed extends Furniture {
    private double capacity;

    public Bed(String name, String color, String material, double price, double capacity) {
        super(name, color, material, price);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Кровать {" +
                "название: " + getName()  +
                ", цвет: " + getColor()  +
                ", материал: " + getMaterial()  +
                ", цена: " + getPrice() +
                ", кол-во спальных мест: " + getCapacity() +
                '}';
    }
}
