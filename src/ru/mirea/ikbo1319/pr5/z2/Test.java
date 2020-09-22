package ru.mirea.ikbo1319.pr5.z2;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        String color;
        boolean filled;
        double r;
        double width;
        double length;
        double side;

        Scanner scan = new Scanner(System.in);
        color = scan.next();
        filled = scan.nextBoolean();
        width = scan.nextDouble();
        length = scan.nextDouble();

        Rectangle rect = new Rectangle(color, filled, width, length);
        color = scan.next();
        filled = scan.nextBoolean();
        r = scan.nextDouble();
        Circle circ = new Circle(color, filled, r);

        color = scan.next();
        filled = scan.nextBoolean();
        side = scan.nextDouble();
        Square sqr = new Square(color, filled, side);

        System.out.println(rect.toString());
        System.out.println(circ.toString());
        System.out.println(sqr.toString());

    }
}
