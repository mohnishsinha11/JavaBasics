package org.example.multithreading.synchronization;

// In this case we will get irregular output because we have two different objects for two different threads
// synchronization is not required since objects are different for threads
public class SynchronizedDemo2 {
    public static void main(String[] args) {
        Display1 obj1 = new Display1();
        Display1 obj2 = new Display1();

        MyThread1 thread1 = new MyThread1(obj1, "Radha");
        MyThread1 thread2 = new MyThread1(obj2, "Krishna");

        thread1.start();
        thread2.start();
    }
}
