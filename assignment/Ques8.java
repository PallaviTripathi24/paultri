package assignment;

public class Ques8 {
    public static void rev() {
        System.out.println("Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer\n");
        StringBuffer sb = new StringBuffer("Pallavi tripathi");
        System.out.println("Passeed string " + sb);
        sb.reverse();
        System.out.println("reversed string " + sb);

        sb.delete(4, 10);
        System.out.println("After deletion " + sb);

    }

    public static void main(String[] args) {
        {

            Ques8.rev();

        }
    }
}
