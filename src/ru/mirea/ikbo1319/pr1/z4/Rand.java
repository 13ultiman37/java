package ru.mirea.ikbo1319.pr1.z4;
import java.util.Random;
import java.util.Scanner;

public class Rand {
    public static void main(String[] args) {
        int[] massiv = new int[5];
        System.out.println("1. Метод Math.random() \nИсходный массив: ");
        for (int a = 0; a < massiv.length; a++)
        {
            int num = 0+(int)(Math.random()*100);
            massiv[a] = num;
            System.out.print(massiv[a]+ " ");
        }
        System.out.println("\n" + "Отсортированный массив: ");
        for (int a = 0; a < massiv.length-1; a++)
        {
            for (int z = massiv.length-1;z > a; z--)
                if (massiv[z - 1] > massiv[z]) {
                    int buf = massiv[z - 1];
                    massiv[z - 1] = massiv[z];
                    massiv[z] = buf;
                }
        }
        for (int a = 0; a < massiv.length; a++) {
            System.out.print(massiv[a] + " ");
        }
        int[] massiv2 = new int[5];
        System.out.println('\n' + "2. Метод - класс Random \nИсходный массив: ");
        Random random = new Random();
        for (int a = 0; a < massiv2.length; a++)
        {
            massiv2[a] = random.nextInt(50);
            System.out.print(massiv2[a]+ " ");
        }
        System.out.println("\n" + "Отсортированный массив: ");
        for (int a = 0; a < massiv2.length-1; a++)
        {
            for (int z = massiv2.length-1;z > a; z--)
                if (massiv2[z - 1] > massiv2[z]) {
                    int buf = massiv2[z - 1];
                    massiv2[z - 1] = massiv2[z];
                    massiv2[z] = buf;
                }
        }
        for (int a = 0; a < massiv2.length; a++) {
            System.out.print(massiv2[a] + " ");
        }
}
}
