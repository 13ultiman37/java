package ru.mirea.ikbo1319.pr7;

import java.util.ArrayList;

public class Person extends FurnitureShop {
    ArrayList<Furniture> furnitures = new ArrayList<Furniture>();

    public void AddFurnitures(ArrayList<Furniture> test, int n){
        furnitures.add(test.get(n));
    }

    public void showBasket(){
        System.out.println(furnitures);
    }
}
