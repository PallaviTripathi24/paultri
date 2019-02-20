package assignment;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Q3. Write a program to find the number of occurrences of a character in a string without using loop?\n");
        System.out.println("Enter the string : ");
        String s=sc.nextLine();
        System.out.println("Enter the char to be counted : ");
        String c=sc.next();
        int count=s.length()-s.replaceAll(c,"").length();
        System.out.println("occurances of "+c+" is "+count);
    }
}
