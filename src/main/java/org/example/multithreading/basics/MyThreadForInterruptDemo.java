package org.example.multithreading.basics;

public class MyThreadForInterruptDemo extends Thread{
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("I am a lazy thread");
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            System.out.println("I am interrupted");
        }
    }
}
