package Threademo;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

    public class Ques_ten{

        int count;

        public void incrementCount() {
            count++;
        }

        public void worker1() {
            for (int i=1;i<=1000;i++){
                incrementCount();
            }
        }

        public void worker2() {
            for (int i=1;i<=1000;i++){
                incrementCount();
            }
        }

        public static void main(String[] args) throws InterruptedException {

            Ques_ten synchronizeDemo = new Ques_ten();
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronizeDemo.worker1();
                }
            });
            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronizeDemo.worker2();
                }
            });
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
            System.out.println(synchronizeDemo.count);
        }

    }
