// demo program for demonstrating reentrantlock method instead of synchronized keyword
package org.example.multithreading.enhancement.ReentrantLock;

public class ReentrantLockDemo1 {
    public static void main(String[] args) {
        Display display = new Display();
        MyThread1 thread1 = new MyThread1(display, "Dhoni");
        MyThread1 thread2 = new MyThread1(display, "Yuvraj");
        MyThread1 thread3 = new MyThread1(display, "Kohli");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
