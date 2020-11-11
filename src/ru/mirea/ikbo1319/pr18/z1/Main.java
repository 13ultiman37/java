package ru.mirea.ikbo1319.pr18.z1;

import java.util.Scanner;

public class Main {
    static void multipliers(int n){
    int x = 2;
    while(x <= n){
        if(n % x == 0){
            if(x != n){
                System.out.print(x + ", ");
                multipliers(n / x);
                }
            else System.out.print(x);
            return;
            }
        x++;
        }
    }

    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Введите ваше число: ");
    multipliers(in.nextInt());
    System.out.println(" - все простые множители данного числа.");
    }
}
