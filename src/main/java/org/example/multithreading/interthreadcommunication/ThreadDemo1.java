package org.example.multithreading.interthreadcommunication;

public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        Thread1 thread = new Thread1();
        thread.start();
        thread.join();

        System.out.println("Total : "+ thread.total);
    }
}
