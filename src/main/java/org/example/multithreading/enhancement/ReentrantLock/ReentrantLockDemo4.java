// demo program tryLock method with waiting time
package org.example.multithreading.enhancement.ReentrantLock;

public class ReentrantLockDemo4 {
    public static void main(String[] args) {
        MyThread4 t1 = new MyThread4("First Thread");
        MyThread4 t2 = new MyThread4("Second Thread");
        t1.start();
        t2.start();
    }
}
