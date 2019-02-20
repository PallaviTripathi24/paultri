package assignment;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        System.out.println("Q4. Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String.\n");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        int upper = 0, lower = 0, number = 0, special = 0;
        double totalchar=str.length();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                number++;
            else
                special++;
        }

        System.out.println("Lower case letters : " + lower+" and percentage is "+(lower*100)/totalchar);
        System.out.println("Upper case letters : " + upper+" and percentage is "+(upper*100)/totalchar);
        System.out.println("Number : " + number+" and percentage is "+(number*100)/totalchar);
        System.out.println("Special characters : " + special+" and percentage is "+(special*100)/totalchar);
    }
}

