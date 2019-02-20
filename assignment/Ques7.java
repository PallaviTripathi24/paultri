package assignment;

public class Ques7 {
    static int age = 21;
    static String Firstname = "Pallavi";
    static String Lastname = "Tripathi";

    static {

        System.out.println("-------Static block------");
        String Firstname = "Pallavi";
        String Lastname = "Tripathi";
        int age = 21;
        System.out.println(Firstname);
        System.out.println(Lastname);
        System.out.println(age);
    }

    public static void print() {
        System.out.println("-----using static method and variable-----");
        System.out.println(age);
        System.out.println(Firstname);
        System.out.println(Lastname);

    }
    public static void main(String[] args) {
        System.out.println("Write a program to print your Firstname,LastName" +
                " & age using static block,static method & static variable respectively");

        Ques7 s = new Ques7();
        s.print();

    }
}
