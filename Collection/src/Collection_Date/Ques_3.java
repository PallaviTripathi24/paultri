package Collection_Date;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Ques_3
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string : ");
        String str=sc.nextLine();
        System.out.print("Given original string is:");
        System.out.println(str);
        HashMap<Character,Integer> h1=new HashMap<Character, Integer>();
        char[] arr=str.toCharArray();
        for(char c:arr) {
            if (h1.containsKey(c)) {
                h1.put(c, h1.get(c) + 1);
            } else {
                h1.put(c, 1);
            }
        }
            for(Map.Entry entry:h1.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }


    }

}