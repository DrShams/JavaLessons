package Palindrome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите слово или фразу: ");//Never Odd or Even - true
        Scanner sc = new Scanner(System.in);
        String mytext = sc.nextLine();
        Palindrome palindrome = new Palindrome();
        if (Palindrome.isPalindrome(mytext)) {
            System.out.println("Данное слово/выражение палиндром");
        } else {
            System.out.println("Данное слово/выражение непалиндром");
        }
    }
}
