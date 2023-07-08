package org.example.multithreading.interthreadcommunication;

public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        thread1.start();
        thread1.join();

        System.out.println("Total : "+ thread1.total);
    }
}
