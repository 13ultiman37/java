package ru.mirea.ikbo1319.pr3.z1;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int r;
        Circle circle = new Circle();
        System.out.println("Введите радиус окружности: ");
        r = scan.nextInt();
        circle.setR(r);
        System.out.println("Длина окружности: ");
        System.out.println(circle.getP());
        System.out.println("Площадь окружности: ");
        System.out.println(circle.getS());
    }
}
