package org.example.multithreading.basics;
// defining a thread using Runnable interface
// this way of defining a thread is recommended since we could get benefit of inheritance
public class MyThreadUsingRunnable implements Runnable{
    @Override
    //job of a thread
    public void run() {
        // we can set the name of a thread using below method
        //Thread.currentThread().setName("Sinha");
        for(int i=1;i<=10;i++){
            System.out.println("Child Thread " + Thread.currentThread().getName());
        }
    }
}
