package org.example.multithreading.basics;

public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThreadUsingRunnable obj = new MyThreadUsingRunnable();
        Thread thread = new Thread(obj);

        thread.start();

        Thread.currentThread().setName("Mohnish");
        for(int i=1;i<=10;i++){
            System.out.println("Main Thread : " + Thread.currentThread().getName());
        }
    }
}
