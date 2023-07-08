package org.example.multithreading.synchronization;

public class Display2 {
    //this will use class level lock

    //every class in java have unique lock
    public static synchronized void wish(String name){

        for(int i=0;i<10;i++){
            System.out.print("Good morning : ");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            System.out.println(name);
        }
    }
}
