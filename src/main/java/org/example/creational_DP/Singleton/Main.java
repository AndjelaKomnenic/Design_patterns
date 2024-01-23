package org.example.creational_DP.Singleton;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance("Thread 1");
            System.out.println("Thread 1 - Singleton Instance: " + singleton);
        });

        Thread thread2 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance("Thread 2");
            System.out.println("Thread 2 - Singleton Instance: " + singleton);
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Singleton mainThreadSingleton = Singleton.getInstance("Main Thread");
        System.out.println("Main Thread - Singleton Instance: " + mainThreadSingleton);
    }
}