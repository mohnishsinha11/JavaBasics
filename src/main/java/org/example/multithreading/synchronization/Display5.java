package org.example.multithreading.synchronization;

public class Display5 {
    public void wish(String name){
        ;;;;;;;; // 10k lines of code
        synchronized (Display5.class){
            for(int i=0;i<10;i++){
                System.out.print("Good Morning : ");
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException e){}
                System.out.println(name);
            }
        }
        ;;;;;;;; // 10k lines of code
    }
}
