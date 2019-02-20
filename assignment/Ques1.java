package assignment;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        System.out.println("Q1. Write a program to replace a substring inside a string with other string ?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string :");
        String str = scanner.nextLine();
        System.out.println("enter word to be replaced :");
        String w1 = scanner.next();
        System.out.println("enter word to be replaced with :");
        String w2 = scanner.next();
        System.out.println("output = " + ((String) str).replace(w1, w2));


    }
}
