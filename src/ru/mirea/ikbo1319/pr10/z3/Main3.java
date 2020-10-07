package ru.mirea.ikbo1319.pr10.z3;

import java.util.Scanner;

public class Main3 {
    public static int left_to_right(int a){
        while (a>0){
            System.out.print(a % 10);
            a/=10;
        }
        if (a == 0)
            return 0;
        return left_to_right(a) + left_to_right(a-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        left_to_right(scanner.nextInt());
        System.out.println();
    }
}
