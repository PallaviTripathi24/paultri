package Collection_Date;

import java.util.*;


public class List_Demo {

    public static void main(String[] args) {
        Float sum=0f;
        Scanner sc=new Scanner(System.in);
        List<Float> al=new ArrayList<>();
        System.out.println("enter the float number :");
        System.out.println(" Enter any non numeric value  to terminate ");
        while (sc.hasNextFloat())
        {
            al.add(sc.nextFloat());
        }
        System.out.println("list of numbers are:"+al);
        Iterator<Float> itr=al.iterator();
        while (itr.hasNext()) {
            sum += itr.next();
        }
            System.out.println("sum is : "+sum);

    }

    }


