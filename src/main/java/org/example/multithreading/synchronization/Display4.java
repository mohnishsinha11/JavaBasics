package org.example.multithreading.synchronization;

/*
 * when we don't want to make entire method synchronized then we use synchronized block
 */
public class Display4 {
    public void wish(String name){
        ;;;;;;;; // 10k lines of code
        synchronized (this){
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
