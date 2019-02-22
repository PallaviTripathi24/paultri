package Assign2;

public class Ques_six {
    public static void main(String[] args) {
        tcf();

    }

    public static void tcf() {
        try {
            int a[] = new int[10];
            a[10] = 20 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } finally {

            System.out.println("finally block always executed");
        }
    }
}

