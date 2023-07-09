package org.example.multithreading.enhancement.ThreadPool;

public class PrintJob implements Runnable{
    String name;

    PrintJob(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "... started by Thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        System.out.println(name + "... completed by Thread: "+ Thread.currentThread().getName());
    }
}
