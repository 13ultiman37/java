package ru.mirea.ikbo1319.pr7;

public class Wardrobe extends Furniture {
    private int doors;

    public Wardrobe(String name, String color, String material, double price, int doors) {
        super(name, color, material, price);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {

        return "Шкаф {" +
                "название: " + getName()  +
                ", цвет: " + getColor()  +
                ", материал: " + getMaterial()  +
                ", цена: " + getPrice() +
                ", кол-во дверок: " + getDoors() +
                '}';
    }
}
