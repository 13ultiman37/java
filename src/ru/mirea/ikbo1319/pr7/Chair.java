package ru.mirea.ikbo1319.pr7;

public class Chair extends Furniture{
    private int legs;

    public Chair(String name, String color, String material, double price, int legs) {
        super(name, color, material, price);
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Стул {" +
                "название: " + getName() +
                ", цвет: " + getColor() +
                ", материал: " + getMaterial() +
                ", цена: " + getPrice() +
                ", кол-во ножек: " + getLegs() +
                '}';
    }
}
