package ru.mirea.ikbo1319.pr2.z1;
import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        String name;
        Pitomnik home = new Pitomnik();
        name = scan.next();
        while(!(name.equals("стоп")))
        {
            System.out.println("Возраст: ");
            age = scan.nextInt();
            Sebek bebek = new Sebek(name, age);
            System.out.println("Человеческий возраст: " + bebek.humanage(age));
            home.sebekAdd(name, age);
            System.out.println("Кличка (стоп для завершения): ");
            name = scan.next();
        }
        System.out.println("Вот собаки, которые есть в питомнике:");
        home.Dogoutput();
    }
}