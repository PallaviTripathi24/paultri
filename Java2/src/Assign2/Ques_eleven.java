package Assign2;

public class Ques_eleven {
    public static void main(String[] ag){
        int s = 0;
        int t = 1;
        //  for (int i = 0; i < 10; i++)
        int i=0;
        while(i<10)
        {
            s = s + i;
            //  for (int j = i;j > 0;j--)
            int j=i;
            while(j>0)
            {
                t = t * (j - i);
                j--;
            }
            s = s * t;
            System.out.println("T is " + t);
            i++;
        }
        System.out.println("S is " + s);
    }

}
