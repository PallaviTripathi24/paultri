package Threademo;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class Ques_5 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 1");
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 2");
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 3"+10/0);
                }
            });
        }finally {
            executorService.shutdown();
        }

        System.out.println("End");
    }
}
