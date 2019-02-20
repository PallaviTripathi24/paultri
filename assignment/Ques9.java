package assignment;

public enum Ques9 {
    oneBHK(10),twoBHK(18),threeBHK(32);
    int price;
    Ques9(int p) {
        price = p;
    }
    public int getPrice() {
        return price;
    }

    public static void main(String args[]){
        System.out.println("Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)\n");
        System.out.println("All House prices:");
        for (Ques9 h : Ques9.values())
        {
            System.out.println(h + " " + "price " + h.getPrice() + " lakhs.");
        }
    }
}
