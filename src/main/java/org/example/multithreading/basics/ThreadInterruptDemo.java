package org.example.multithreading.basics;

 public class ThreadInterruptDemo {
    public static void main(String[] args) {
        MyThreadForInterruptDemo thread = new MyThreadForInterruptDemo();
        thread.start();
        thread.interrupt();
        System.out.println("I am main thread");
    }
}
