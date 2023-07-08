package org.example.multithreading.synchronization;
// this class is to be used with Display2 and Mythread2
public class SynchronizedDemo3 {
    public static void main(String[] args) {
        Display2 obj1 = new Display2();
        Display2 obj2 = new Display2();

        MyThread2 thread1 = new MyThread2(obj1, "Radha");
        MyThread2 thread2 = new MyThread2(obj2, "Krishna");

        thread1.start();
        thread2.start();
    }
}
