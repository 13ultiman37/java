package ru.mirea.ikbo1319.pr15;

import java.util.Scanner;

public class Operations {
    private Scanner scan = new Scanner(System.in);
    private int[] mass;

    public Operations(int ... numbers){
        mass = numbers;
    }

    public int[] add(int[] mass){
        int x;
        System.out.print("Введите число для добавления в коллекцию: ");
        x = scan.nextInt();
        int[] buffer=new int[mass.length+1];
        for(int i=0;i< mass.length;++i){
            buffer[i]=mass[i];
        }
        buffer[mass.length]=x;
        mass = buffer;
        return mass;
    }

    public int[] delete(int[] mass){
        int x;
        System.out.print("Введите номер элемента для удаления: ");
        x = scan.nextInt();
        for(int i=0;i< mass.length;++i){
            if(mass[i]==x){
                int[] buffer=new int[mass.length-1];
                for(int j=i;j< mass.length-1;++j){
                    mass[j]=mass[j+1];
                }
                for(int k=0;k< mass.length-1;++k){
                    buffer[k]=mass[k];
                }
                mass=buffer;
                break;
            }
        }
        return mass;
    }

    public int searchValue(int mass[]){
        int found;
        int result = 0;
        System.out.print("Введите значение числа, индекс которого вы хотите найти: ");
        found = scan.nextInt();
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == found) result = i;
        }
        return result + 1;
    }

    public int searchIndex(int mass[]){
        int found;
        int result = 0;
        System.out.print("Введите индекс числа, значение которого вы хотите найти: ");
        found = scan.nextInt();
        for (int i = 0; i < mass.length; i++) {
            if (i == found - 1) result = mass[i];
        }
        return result;
    }

    public int max(int mass[]){
        System.out.println("Число с максимальным значением: ");
        int max = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) max = mass[i];
        }
        return max;
    }

    public int min(int mass[]){
        System.out.println("Число с минимальным значением: ");
        int min = 100000;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < min) min = mass[i];
        }
        return min;
    }

    public double avg(int[] mass) {
        System.out.println("Среднее арифметическое всех чисел: ");
        double sum = 0;
        for (int i = 0; i < mass.length; i++) {
            sum += mass[i];
        }
        return sum / mass.length;
    }
}

