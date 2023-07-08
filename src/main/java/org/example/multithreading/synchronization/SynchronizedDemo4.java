package org.example.multithreading.synchronization;

public class SynchronizedDemo4 {
    public static void main(String[] args) {
        Display3 obj1 = new Display3();
        Display3 obj2 = new Display3();
        MyThread3 thread1 = new MyThread3(obj1);
        MyThread4 thread2 = new MyThread4(obj2);

        thread1.start();
        thread2.start();
    }
}
