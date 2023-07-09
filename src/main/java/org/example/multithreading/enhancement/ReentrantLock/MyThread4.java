// program to demonstrate tryLock() usage with waiting time
package org.example.multithreading.enhancement.ReentrantLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread4 extends Thread {
    static ReentrantLock reentrantLock = new ReentrantLock();
    MyThread4(String name){
        super(name);
    }

    public void run(){
        do{
            try {
                if(reentrantLock.tryLock(3000, TimeUnit.MILLISECONDS)){
                    System.out.println(Thread.currentThread().getName() + "....got lock and performing safe operations");
                    Thread.sleep(25000);
                    System.out.println(Thread.currentThread().getName() + "....releases lock");
                    reentrantLock.unlock();
                    break;
                }
                else {
                    System.out.println(Thread.currentThread().getName() + "....unable to get the lock and will try again");
                }
            } catch (InterruptedException e) {}
        }while(true);
    }
}
