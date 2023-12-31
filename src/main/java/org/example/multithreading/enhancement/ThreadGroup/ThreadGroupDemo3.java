package org.example.multithreading.enhancement.ThreadGroup;

//program to print all active system threads
public class ThreadGroupDemo3 {
    public static void main(String[] args) {
        ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
        Thread[] t = new Thread[system.activeCount()];
        system.enumerate(t);

        for(Thread thread : t){
            System.out.println(thread.getName() + " : " + thread.isDaemon());
        }
    }
}
