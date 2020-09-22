package ru.mirea.ikbo1319.pr6.z2;


import java.util.Scanner;

public class MovableMainRectangle {
    public static void main(String[] args) {
        String color;
        boolean filled;
        double width, length, x, y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Начальная координата х: ");
        x = scan.nextDouble();
        System.out.println("Начальная координата y: ");
        y = scan.nextDouble();
        System.out.println("Цвет: ");
        color = scan.next();
        System.out.println("Сплошной ли: ");
        filled = scan.nextBoolean();
        System.out.println("Длина: ");
        length = scan.nextDouble();
        System.out.println("Ширина: ");
        width = scan.nextDouble();
        MovableRectangle rc = new MovableRectangle(color, filled, width, length, x, y);
        System.out.println("На сколько сместить по х: ");
        x = scan.nextDouble();
        System.out.println("На сколько сместить по у: ");
        y = scan.nextDouble();
        rc.move(x, y);
        System.out.println(rc.toString());


    }
}