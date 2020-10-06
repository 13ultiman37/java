package ru.mirea.ikbo1319.pr7;

public class Table extends Furniture {
    private int seat;

    public Table(String name, String color, String material, double price, int seats) {
        super(name, color, material, price);
        this.seat = seats;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Стол {" +
                "название: " + getName()  +
                ", цвет: " + getColor()  +
                ", материал: " + getMaterial()  +
                ", цена: " + getPrice() +
                ", кол-во посадочных мест: " + getSeat() +
                '}';
    }
}
