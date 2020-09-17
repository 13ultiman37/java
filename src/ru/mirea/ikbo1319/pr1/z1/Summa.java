package ru.mirea.ikbo1319.pr1.z1;

public class Summa {

    public static void main(String[] args) {
        int mass[] = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + mass[i];
        }
        System.out.println("Сумма For:" + sum);

        int i = 0;
        int sum1 = 0;
        while (i < 5) {
            sum1 = sum1 + mass[i];
            i++;
        }
        System.out.println("Сумма while:" + sum1);

        int sum2 = 0;
        i = 4;
        do {
            sum2 = sum2 + mass[i];
            i--;
        }
        while (i >= 0);
        System.out.println("Сумма do while:" + sum2);
    }
}