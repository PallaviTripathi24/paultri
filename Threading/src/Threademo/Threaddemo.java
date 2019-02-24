package Threademo;

public class Threaddemo extends Thread {
    public void Run(){
        System.out.println("Thread demo : ");
    }

    public static void main(String[] args) {
//            new Threaddemo().start();
        Threaddemo th=new Threaddemo();
        th.start();
    }
}
