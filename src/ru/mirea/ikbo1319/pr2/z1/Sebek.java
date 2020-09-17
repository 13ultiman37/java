package ru.mirea.ikbo1319.pr2.z1;

public class Sebek {
    int age;
    String name;
    public Sebek(String name, int age)
    {
        this.age = age;
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int humanage(int age)
    {
        return this.age = age*7;
    }

    @Override
    public String toString() {
        return "Sebek{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}