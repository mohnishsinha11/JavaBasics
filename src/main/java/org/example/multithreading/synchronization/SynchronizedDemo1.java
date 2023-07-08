package org.example.multithreading.synchronization;

public class SynchronizedDemo1 {
    public static void main(String[] args) {
        Display1 display = new Display1();

        MyThread1 thread1 = new MyThread1(display, "Radha");
        MyThread1 thread2 = new MyThread1(display, "Krishna");

        thread1.start();
        thread2.start();
    }
}
