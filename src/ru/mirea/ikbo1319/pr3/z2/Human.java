package ru.mirea.ikbo1319.pr3.z2;
import java.util.Scanner;

public class Human {
    public static void main(String[] args)
    {
        String name, orientation, haircolor, eyecolor, brand;
        int size;

        Scanner scan = new Scanner(System.in);
        System.out.println("Создай своего человека!");
        System.out.println("Введите имя человека: ");
        name = scan.next();
        System.out.println("//------------------------Голова------------------------//");
        System.out.println("Введите цвет волос: ");
        haircolor = scan.next();
        System.out.println("Введите цвет глаз: ");
        eyecolor = scan.next();
        System.out.println("//-------------------------Руки-------------------------//");
        System.out.println("Введите правша или левша: ");
        orientation = scan.next();
        System.out.println("//-------------------------Ноги-------------------------//");
        System.out.println("Введите бренд обуви:");
        brand = scan.next();
        System.out.println("Введите размер обуви: ");
        size = scan.nextInt();

        Head head = new Head();
        Hand hand = new Hand();
        Leg leg = new Leg();

        head.setName(name);
        head.setEyecolor(eyecolor);
        head.setHaircolor(haircolor);
        hand.setOrientation(orientation);
        leg.setBrand(brand);
        leg.setSize(size);

        System.out.println('\n' + "Вот получившийся человек: ");
        System.out.println("Имя: " + head.getName());
        System.out.println("Цвет глаз: " + head.getEyecolor());
        System.out.println("Цвет волос: " + head.getHaircolor());
        System.out.println("Правша или левша: " + hand.getOrientation());
        System.out.println("Бренд обуви: " + leg.getBrand());
        System.out.println("Размер обуви: " + leg.getSize());
    }
}
