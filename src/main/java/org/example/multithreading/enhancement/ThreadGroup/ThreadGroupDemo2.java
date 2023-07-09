package org.example.multithreading.enhancement.ThreadGroup;

public class ThreadGroupDemo2 {
    public static void main(String[] args) {
        ThreadGroup g1 = new ThreadGroup("tg");

        Thread t1 = new Thread(g1, "Thread1");
        Thread t2 = new Thread(g1, "Thread2");

        // this method will not affect the priority of thread created earlier
        g1.setMaxPriority(3);

        Thread t3 = new Thread(g1, "Thread3");

        System.out.println(t1.getPriority());  //5
        System.out.println(t2.getPriority());  //5
        System.out.println(t3.getPriority());  //3

        System.out.println(g1.activeCount());
    }
}
