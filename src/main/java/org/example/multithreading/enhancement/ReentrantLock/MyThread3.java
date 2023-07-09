// program to demonstrate tryLock() usage
package org.example.multithreading.enhancement.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class MyThread3 extends Thread {
    static ReentrantLock reentrantLock = new ReentrantLock();
    MyThread3(String name){
        super(name);
    }

    public void run(){
        if(reentrantLock.tryLock()){
            System.out.println(Thread.currentThread().getName() + "....got lock and performing safe operations");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            System.out.println(Thread.currentThread().getName() + "....unable to get the lock hence performing alternative operations");
        }
    }
}
