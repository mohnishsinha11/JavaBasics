package org.example.multithreading.synchronization;

public class SynchronizedBlockDemo5 {
    public static void main(String[] args) {
        Display4 display = new Display4();

        MyThread5 thread1 = new MyThread5(display, "Radha");
        MyThread5 thread2 = new MyThread5(display, "Krishna");

        thread1.start();
        thread2.start();
    }
}
