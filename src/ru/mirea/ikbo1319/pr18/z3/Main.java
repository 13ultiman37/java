package ru.mirea.ikbo1319.pr18.z3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваши числа (0 для завершения работы): ");
        int max = scan.nextInt();
        while(true){
            int x = scan.nextInt();
            if(x == 0)
                break;
            if(x > max)
                max = x;
        }
        System.out.println("Максимальное число вашей последовательности: " + max);
    }
}