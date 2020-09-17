package ru.mirea.ikbo1319.pr1.z3;

public class Garm {
    public static void main(String[] args) {
        double garm = 0;
        double n = 1;
        System.out.println("10 чисел гармонического ряда: ");
        while (n < 10) {
            garm = 1 / n;
            String message = String.format("%.3f", garm);
            System.out.print(message + " ");
            n++;
        }
    }
}
