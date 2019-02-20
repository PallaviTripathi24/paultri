package assignment;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        System.out.println("Q2. Write a program to find the number of occurrences of the duplicate words in a string and print them?\n");
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the string : ");
        String input=sc.nextLine();
        System.out.println("Given string is : "+input+"\n");
        String a[]=input.split(" ");
//        System.out.println(a.length);
//        System.out.println("enter the word to be counted :");
        String word=sc.next();
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(word.equals(a[i]))
                count=count+1;
        }
        System.out.println("occurances of " + word + " is " +count);
    }
}
