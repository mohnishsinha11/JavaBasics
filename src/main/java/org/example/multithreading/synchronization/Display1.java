package org.example.multithreading.synchronization;

public class Display1 {
    // if we don't use synchronized keyword we will get irregular output

    // every object in java has a unique lock
    public synchronized void wish(String name){

        for(int i=0;i<10;i++){
            System.out.print("Good morning : ");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){}
            System.out.println(name);
        }
    }
}
