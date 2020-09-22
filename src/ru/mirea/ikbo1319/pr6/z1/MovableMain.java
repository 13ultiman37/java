package ru.mirea.ikbo1319.pr6.z1;

import java.util.Scanner;

public class MovableMain {
    public static void main(String[] args) {
        String color;
        boolean filled;
        double r;
        double x, y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Начальная координата х: ");
        x = scan.nextDouble();
        System.out.println("Начальная координата y: ");
        y = scan.nextDouble();
        System.out.println("Цвет: ");
        color = scan.next();
        System.out.println("Сплошной ли: ");
        filled = scan.nextBoolean();
        System.out.println("Радиус: ");
        r = scan.nextDouble();
        MovableCircle mc = new MovableCircle(color, filled, r, x, y);
        System.out.println("На сколько сместить по х: ");
        x = scan.nextDouble();
        System.out.println("На сколько сместить по у: ");
        y = scan.nextDouble();
        mc.move(x, y);
        System.out.println(mc.toString());


    }
}
