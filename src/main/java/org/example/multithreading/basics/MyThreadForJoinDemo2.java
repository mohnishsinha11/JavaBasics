package org.example.multithreading.basics;

public class MyThreadForJoinDemo2 extends Thread{
    public static Thread mainThread;
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Child Thread");
            if(i==4){
                try {
                    mainThread.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
