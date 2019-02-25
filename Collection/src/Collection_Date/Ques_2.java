package Collection_Date;

import java.util.*;
public class Ques_2 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string : ");
        String str=sc.nextLine();
        System.out.print("Given original string is:");
        System.out.println(str);
        HashSet<Character> li =new HashSet<>();
            for(int i=0;i<str.length();i++) {
                li.add(str.charAt(i));
            }
        System.out.println("Unique Characters are:"+li);
    }
}
