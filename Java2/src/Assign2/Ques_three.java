package Assign2;

public class Ques_three {
    public static void main(String args[]) {
        try
        {
            Class.forName("Pallavi");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}
