package org.example.multithreading.synchronization;
/*
    Play with the prototype of displayn and displayc method
        Consider
        1. Both as normal methods
        2. Make both methods static
        3. Make both methods synchronized
        4. Make both methods synchronized and static
 */
public class Display3 {
    public static synchronized void displayn(){
        for(int i=0;i<10;i++){
            System.out.print(i);
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){}
        }
    }

    public static synchronized void displayc(){
        for(int i=65;i<=74;i++){
            System.out.print((char) i);
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){}
        }
    }
}
