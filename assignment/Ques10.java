package assignment;

public class Ques10 {
    void add(int a, int b){
        System.out.println("The addition of integer numbers is:"+(a+b));
    }
    void add(double a,double b){
        System.out.println("The addition of double numbers is:"+(a+b));
    }
    void mult(float a,float b){
        System.out.println("The multiplication of float numbers is:"+(a*b));
    }
    void mult(int a,int b){
        System.out.println("The multiplication of integer numbers is:"+(a*b));
    }
    void concat(String a,String b){
        System.out.println("The concatination of two string is:"+(a+b));
    }
    void concat(String a,String b,String c){
        System.out.println("The concatination of three strings is:"+(a+b+c));
    }

    public static void main(String[] args) {
        Ques10 object=new Ques10();
        object.add(2,3);
        object.add(2.5,3.5);
        object.mult(2,3);
        object.mult(2f,3f);
        object.concat("Assignment ","Java");
        object.concat("Assignment ","on ","Java");
    }

}
