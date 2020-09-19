package ru.mirea.ikbo1319.pr3.z2;
import java.util.Scanner;

public class HumanTest {

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


        Human human = new Human(new Head(haircolor, name, eyecolor), new Leg(brand, size), new Hand(orientation));

        System.out.println('\n' + "Вот получившийся человек: ");
        System.out.println("Имя: " + human.getHead().getName());
        System.out.println("Цвет глаз: " + human.getHead().getEyecolor());
        System.out.println("Цвет волос: " + human.getHead().getHaircolor());
        System.out.println("Правша или левша: " + human.getHand().getOrientation());
        System.out.println("Бренд обуви: " + human.getLeg().getBrand());
        System.out.println("Размер обуви: " + human.getLeg().getSize());

    }
}
