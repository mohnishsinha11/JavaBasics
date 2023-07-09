package org.example.multithreading.interthreadcommunication;

/*
 * if we use join() then main thread have to wait for entire thread1(child thread) to finish.
 * best solution is to use wait(), notify(), notifyAll()
 */
public class Thread1 extends Thread{
    int total = 0;

    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            total+=1;
        }

        /*
         * 1 crore lines of codes
         */

        // if we use thread1.join then main thread have to wait for entire thread1(child thread) operation to finish
        // best solution is to use wait(), notify(), notifyAll()
    }
}
