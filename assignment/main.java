package assignment;

public class main {
    public static void main(String[] args) {
        System.out.println("Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails+" +
                " which provide there specific details like rateofinterest etc,print details of every banks");
        Bank b=new SBI();
        b.getDetails("Laxmi nagar",5);
        Bank b1=new ICICI();
        b1.getDetails("Shahdra",10);

        Bank b2=new AXIS();



        b2.getDetails("Saket",15);
    }
}
