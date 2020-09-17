package ru.mirea.ikbo1319.pr3.z3;
import java.util.Scanner;
import java.util.SortedMap;

public class BookTest {

    public static void main(String[] args)
    {
        String name, author;
        int pages, year;

        Scanner scan = new Scanner(System.in);
        Book book = new Book();
        System.out.println("Введите название книги: ");
        name = scan.next();
        System.out.println("Введите автора книги: ");
        author = scan.next();
        System.out.println("Введите год написания: ");
        year = scan.nextInt();
        System.out.println("Введите количество страниц: ");
        pages = scan.nextInt();

        book.setName(name);
        book.setAuthor(author);
        book.setYear(year);
        book.setPages(pages);

        System.out.println("Вы поставили следующую книгу на полку: ");
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Название: " + book.getName());
        System.out.println("Год: " + book.getYear());
        System.out.println("Количество страниц: " + book.getPages());
    }
}
