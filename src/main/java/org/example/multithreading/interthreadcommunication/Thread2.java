package org.example.multithreading.interthreadcommunication;
/*
 *   wait(), notify(), notifyAll() method is present in object class not Thread class.
 *   It is to be noted that other than multithreading these methods are not used anywhere else.
 *   Since thread can call wait method on any java object therefore for every java object wait method is required.
 *   Therefore, wait(), notify() and notifyAll() method is present in object class.
 *   For invoking these methods thread should be owner of that particular object that means thread should have lock of that object.
 *   That means thread should be inside the synchronized area, otherwise we will get IllegalMonitorStateException.
 *   If any thread calls wait method on any object it immediately releases the lock for that object and then goes to waiting state.
 *   If any thread calls notify method on any object it releases the lock for that particular object but may not immediately.
 *   Except wait, notify, notifyAll, thread won't release the lock anywhere else.
 */
public class Thread2 extends Thread{
    int total = 0;

    @Override
    public void run() {
        synchronized (this){
            System.out.println("Child thread starts calculation");
            for(int i=1;i<=100;i++){
                total+=1;
            }
            System.out.println("Child thread trying to give notification");
            this.notify();
        }

        /*
         * 1 crore lines of codes
         */
    }
}
