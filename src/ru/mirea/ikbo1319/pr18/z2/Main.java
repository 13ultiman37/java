package ru.mirea.ikbo1319.pr18.z2;

import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str){
        if(str.length() == 0 || str.length() == 1)
            return true;
        if(str.charAt(0) == str.charAt(str.length()-1))
            return isPalindrome(str.substring(1, str.length()-1));
        return false;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше слово: ");
        System.out.print(isPalindrome(scanner.nextLine()) ? "YES" : "NO");
    }
}