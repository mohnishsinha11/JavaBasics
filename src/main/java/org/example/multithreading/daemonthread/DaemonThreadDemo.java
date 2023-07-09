package org.example.multithreading.daemonthread;

/*
 * Once last non daemon thread is terminated all daemon threads are terminated automatically since damon thread is only their for
 * supporting the non daemons one. Therefore, in this class, once the main thread completes its execution child thread will terminate
 * automatically. Hence, "Child Thread" won't be printed 10 times.
 */
public class DaemonThreadDemo {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.setDaemon(true);
        thread.start();
        System.out.println("End of Main");
    }
}
