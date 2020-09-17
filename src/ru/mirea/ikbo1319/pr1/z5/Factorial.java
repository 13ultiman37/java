package ru.mirea.ikbo1319.pr1.z5;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
    System.out.println('\n' + "Введите число для рассчёта факториала:");
    Scanner in = new Scanner(System.in);
    int f = in.nextInt();
    int r = 1;
        for (int i = 1; i <= f; i++)
    {
        r = r * i;
    }
        System.out.println(f + "!:" + r);
}
}
