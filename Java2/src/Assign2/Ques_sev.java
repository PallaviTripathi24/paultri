package Assign2;

import java.util.Scanner;

public class Ques_sev {
    public static void main(String[] args) {
        System.out.println("enter the number to be converted ; ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int days = num / (24 * 3600);
        num %= (24 * 3600);
        int hour = num / 3600;
        num %= 3600;
        int minutes = num / 60;
        num %= 60;
        int seconds = num;
        System.out.println(days + " " + "no. of days and" + hour + " " + "no of hours and " + minutes + " "
                + "no of minutes and " + seconds + " "
                + "no of seconds and");

    }
}
