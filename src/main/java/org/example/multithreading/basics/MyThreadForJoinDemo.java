package org.example.multithreading.basics;

public class MyThreadForJoinDemo extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }
    }
}
