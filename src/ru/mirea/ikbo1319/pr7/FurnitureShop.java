package ru.mirea.ikbo1319.pr7;

import java.util.ArrayList;

public class FurnitureShop {
    ArrayList<Furniture> chairs = new ArrayList<Furniture>();
    ArrayList<Furniture> sofas = new ArrayList<Furniture>();
    ArrayList<Furniture> tables = new ArrayList<Furniture>();
    ArrayList<Furniture> wardrobes = new ArrayList<Furniture>();
    ArrayList<Furniture> beds = new ArrayList<Furniture>();

    public void AddChair (Furniture furniture){
        chairs.add(furniture);
    }

    public void AddSofa (Furniture furniture){
        sofas.add(furniture);
    }

    public void AddTable (Furniture furniture){
        tables.add(furniture);
    }

    public void AddWardrobe (Furniture furniture){
        wardrobes.add(furniture);
    }

    public void AddBed (Furniture furniture){
        beds.add(furniture);
    }

    public ArrayList<Furniture> getChairs() {
        return chairs;
    }

    public ArrayList<Furniture> getSofas() {
        return sofas;
    }

    public ArrayList<Furniture> getTables() {
        return tables;
    }

    public ArrayList<Furniture> getWardrobes() {
        return wardrobes;
    }

    public ArrayList<Furniture> getBeds() {
        return beds;
    }

    public void Catalog(){
        System.out.println("//------------------------------------------------Каталог------------------------------------------------------//");
        for (int i = 0; i < 4; i++)
        {
            System.out.println(chairs.get(i));
        }
        System.out.println('\n');
        for (int i = 0; i < 3; i++)
        {
            System.out.println(sofas.get(i));
        }
        System.out.println('\n');
        for (int i = 0; i < 3; i++)
        {
            System.out.println(tables.get(i));
        }
        System.out.println('\n');
        for (int i = 0; i < 3; i++)
        {
            System.out.println(wardrobes.get(i));
        }
        System.out.println('\n');
        for (int i = 0; i < 3; i++)
        {
            System.out.println(beds.get(i));
        }
        System.out.println('\n' + "//-------------------------------------------------------------------------------------------------------------//");
    }
}
