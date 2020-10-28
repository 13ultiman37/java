package ru.mirea.ikbo1319.pr15;

import java.util.Random;
import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        int buffer[];
        int size = 0;
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            mass[i] = random.nextInt(10) + 1;
        }
        int check = 1;

        Operations ops = new Operations();
        while (check!=0){
            System.out.println("Выберите действие: ");
            System.out.println("1. Добавить элемент ");
            System.out.println("2. Удалить элемент ");
            System.out.println("3. Найти элемент по значению ");
            System.out.println("4. Найти элемент по индексу ");
            System.out.println("5. Найти максимальный элемент ");
            System.out.println("6. Найти минимальный элемент ");
            System.out.println("7. Найти среднее арифметическое ");
            System.out.println("8. Вывести коллекцию ");
            System.out.println("0. Завершить работу ");

            check = scan.nextInt();
            switch (check){
                case 1:
                    size = mass.length + 1;
                    buffer = new int[mass.length + 1];
                    buffer = ops.add(mass);
                    mass = new int[size];
                    mass = buffer;
                    break;
                case 2: {
                    size = mass.length - 1;
                    buffer = new int[mass.length - 1];
                    buffer = ops.delete(mass);
                    mass = new int[size];
                    mass = buffer;
                }
                case 3:
                    System.out.println("Нужный элемент находится по номеру: " + ops.searchValue(mass));
                    break;
                case 4:
                    System.out.println("Нужный индекс: " + ops.searchIndex(mass));
                    break;
                case 5:
                    System.out.println("Максимальный элемент: " + ops.max(mass));
                    break;
                case 6:
                    System.out.println("Минимальный элемент: " + ops.min(mass));
                    break;
                case 7:
                    System.out.println("Среднее арифметическое: " + ops.avg(mass));
                    break;
                case 8: {
                    for (int i = 0; i < mass.length; i++) {
                        System.out.print(mass[i] + " ");
                    }
                    System.out.println();
                }
                break;
                case 0:{
                    break;
                }
                default:
                    System.out.println("Повторите ввод: ");
            }
        }
    }
}
