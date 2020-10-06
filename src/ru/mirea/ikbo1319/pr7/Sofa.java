package ru.mirea.ikbo1319.pr7;

public class Sofa extends Furniture {
    private boolean transformation;
    private int capacity;

    public Sofa(String name, String color, String material, double price, boolean transformation, int capacity) {
        super(name, color, material, price);
        this.transformation = transformation;
        this.capacity = capacity;
    }

    public String isTransformation() {
        if (transformation) return "раскладной";
        else return "нераскладной";
    }

    public void setTransformation(boolean transformation) {
        this.transformation = transformation;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Диван {" +
                "название: " + getName()  +
                ", цвет: " + getColor()  +
                ", материал: " + getMaterial()  +
                ", цена: " + getPrice() +
                ", раскладывается: " + isTransformation() +
                ", вместимость, человек: " + getCapacity() +
                '}';
    }
}
