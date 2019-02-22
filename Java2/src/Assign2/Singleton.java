package Assign2;

public class Singleton {
    private static Singleton ssingleton = null;
    public String s;
    private Singleton()
    {
        s = "Hello I am  Singleton class";
    }
    public static Singleton getInstance()
    {
        if (ssingleton == null)
            ssingleton = new Singleton();

        return ssingleton;
    }
}
class Sing
{
    public static void main(String args[]){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1.s);
        System.out.println(s2.s);

    }
}
