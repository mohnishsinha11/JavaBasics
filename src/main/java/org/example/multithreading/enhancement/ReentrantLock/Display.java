// this program is to demonstrate how to use ReentrantLock instead of synchronized keyword
package org.example.multithreading.enhancement.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

/*
 * if we comment lines 1 and 2 then the threads will be executed simultaneously and we will get irregular output
 * if we don't comment lines 1 and 2 then the threads will be executed one by one and we will get regular output
 */
public class Display {
    ReentrantLock l = new ReentrantLock();
    public void wish(String name){
        l.lock();     // line 1
        for(int i=1;i<=10;i++){
            System.out.print("Good morning : ");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            System.out.println(name);
        }
        l.unlock();  // line 2
    }
}
