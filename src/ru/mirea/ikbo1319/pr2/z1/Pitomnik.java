package ru.mirea.ikbo1319.pr2.z1;

import java.util.ArrayList;


public class Pitomnik {
    ArrayList <Sebek> dogs = new ArrayList<Sebek>();
    public void sebekAdd(String name, int age)
    {
        dogs.add(new Sebek(name, age));
    }
    public void Dogoutput()
    {
        System.out.println(dogs);
    }
}