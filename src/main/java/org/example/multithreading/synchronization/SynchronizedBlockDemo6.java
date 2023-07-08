package org.example.multithreading.synchronization;

public class SynchronizedBlockDemo6 {
    public static void main(String[] args) {
        Display5 obj1 = new Display5();
        Display5 obj2 = new Display5();

        MyThread6 thread1 = new MyThread6(obj1, "Radha");
        MyThread6 thread2 = new MyThread6(obj2, "Krishna");

        thread1.start();
        thread2.start();
    }
}
