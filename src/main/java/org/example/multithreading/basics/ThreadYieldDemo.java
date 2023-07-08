package org.example.multithreading.basics;
/*
 * yield is a static method of Thread class and it can stop the currently executing thread and
 * will give a chance to other waiting threads of the same priority.
 * If in case there are no waiting threads or if all the waiting threads have low priority
 * then the same thread will continue its execution.
 */
public class ThreadYieldDemo {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
            if(i==3)
                Thread.yield();
        }
    }
}
