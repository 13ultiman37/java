package ru.mirea.ikbo1319.pr7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        FurnitureShop furnitureShop = new FurnitureShop();
        Chair chair1 = new Chair("1. JANINGE", "белый", "пластик", 399, 4);
        Chair chair2 = new Chair("2. LEIFARNE", "черный/желтый", "металл/пластик", 449, 4);
        Chair chair3 = new Chair("3. JANINGE BAR", "белый", "металл/пластик", 779, 1);
        Chair chair4 = new Chair("4. NORRAKER", "деревянный", "дерево", 299, 4);

        furnitureShop.AddChair(chair1);
        furnitureShop.AddChair(chair2);
        furnitureShop.AddChair(chair3);
        furnitureShop.AddChair(chair4);

        Sofa sofa1 = new Sofa("1. HEMLINGBY", "серый", "ткань", 499, false, 2);
        Sofa sofa2 = new Sofa("2. FRIHETEN", "черный", "ткань", 3499, true, 3);
        Sofa sofa3 = new Sofa("3. GRONLID", "коричневый", "кожа", 4499, true, 3);

        furnitureShop.AddSofa(sofa1);
        furnitureShop.AddSofa(sofa2);
        furnitureShop.AddSofa(sofa3);

        Table table1 = new Table("1. MORBYLANGA", "тёмное дерево", "дерево", 4999, 8);
        Table table2 = new Table("2. TARENDO", "черный", "дерево", 259, 4);
        Table table3 = new Table("3. BEKANT", "белый", "дерево/металл", 699, 1);

        furnitureShop.AddTable(table1);
        furnitureShop.AddTable(table2);
        furnitureShop.AddTable(table3);

        Wardrobe wardrobe1 = new Wardrobe("1. KLEPPSTAD", "белый", "дерево", 499, 3);
        Wardrobe wardrobe2 = new Wardrobe("2. RAKKESTAD", "черный", "дерево", 599, 2);
        Wardrobe wardrobe3 = new Wardrobe("3. PAX", "деревянный", "дерево", 4400, 4);

        furnitureShop.AddWardrobe(wardrobe1);
        furnitureShop.AddWardrobe(wardrobe2);
        furnitureShop.AddWardrobe(wardrobe3);

        Bed bed1 = new Bed("1. HEMNES", "коричневый", "дерево", 1299, 1);
        Bed bed2 = new Bed("2. SOFTELAND", "бежевый", "дерево/кожа", 3299, 2);
        Bed bed3 = new Bed("3. HAUGA", "серый", "ткань", 1499, 1.5);

        furnitureShop.AddBed(bed1);
        furnitureShop.AddBed(bed2);
        furnitureShop.AddBed(bed3);

        furnitureShop.Catalog();
        Person basket = new Person();
        Scanner scan = new Scanner(System.in);
        int x = 100;
        int y = 100;
        while (x != 0) {
            System.out.println("Выберете категорию (0 для завершения покупок): \n 1. Стулья \n 2. Диваны \n 3. Столы \n 4. Шкафы \n 5. Кровати");
            x = scan.nextInt();
            switch (x) {
                case 1: {
                    System.out.println("Выберете модель стула: ");
                    y = scan.nextInt();
                    switch (y) {
                        case 1:
                            basket.AddFurnitures(furnitureShop.getChairs(), 0);
                            break;
                        case 2:
                            basket.AddFurnitures(furnitureShop.getChairs(), 1);
                            break;
                        case 3:
                            basket.AddFurnitures(furnitureShop.getChairs(), 2);
                            break;
                        case 4:
                            basket.AddFurnitures(furnitureShop.getChairs(), 3);
                            break;
                    }
                }
                break;
                case 2: {
                    System.out.println("Выберете модель дивана: ");
                    y = scan.nextInt();
                    switch (y) {
                        case 1:
                            basket.AddFurnitures(furnitureShop.getSofas(), 0);
                            break;
                        case 2:
                            basket.AddFurnitures(furnitureShop.getSofas(), 1);
                            break;
                        case 3:
                            basket.AddFurnitures(furnitureShop.getSofas(), 2);
                            break;
                    }
                }
                break;
                case 3: {
                    System.out.println("Выберете модель стола: ");
                    y = scan.nextInt();
                    switch (y) {
                        case 1:
                            basket.AddFurnitures(furnitureShop.getTables(), 0);
                            break;
                        case 2:
                            basket.AddFurnitures(furnitureShop.getTables(), 1);
                            break;
                        case 3:
                            basket.AddFurnitures(furnitureShop.getTables(), 2);
                            break;
                    }
                }
                break;
                case 4: {
                    System.out.println("Выберете модель шкафа: ");
                    y = scan.nextInt();
                    switch (y) {
                        case 1:
                            basket.AddFurnitures(furnitureShop.getWardrobes(), 0);
                            break;
                        case 2:
                            basket.AddFurnitures(furnitureShop.getWardrobes(), 1);
                            break;
                        case 3:
                            basket.AddFurnitures(furnitureShop.getWardrobes(), 2);
                            break;
                    }
                }
                break;
                case 5: {
                    System.out.println("Выберете модель кровати: ");
                    y = scan.nextInt();
                    switch (y) {
                        case 1:
                            basket.AddFurnitures(furnitureShop.getBeds(), 0);
                            break;
                        case 2:
                            basket.AddFurnitures(furnitureShop.getBeds(), 1);
                            break;
                        case 3:
                            basket.AddFurnitures(furnitureShop.getBeds(), 2);
                            break;
                    }
                }
                break;
            }
        }
        System.out.println("Ваша корзина: ");
        basket.showBasket();
    }

}
