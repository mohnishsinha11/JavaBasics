package org.example.multithreading.basics;

public class ThreadJoinDemo2 {
    public static void main(String[] args) throws InterruptedException {
        MyThreadForJoinDemo2 thread = new MyThreadForJoinDemo2();
        MyThreadForJoinDemo2.mainThread = Thread.currentThread();

        thread.start();

        for(int i=1;i<=10;i++){
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }
    }
}
