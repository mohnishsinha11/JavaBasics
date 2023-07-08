package org.example.multithreading.basics;

/*
 * here the expected output will be 'Child Thread' 10 times followed by 'Main Thread' 10 times
 * but some operating systems/platforms won't provide support for thread priorities,
 * so we can get unexpected results
 */
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.setPriority(10);
        thread.start();

        Thread.currentThread().setPriority(1);
        for(int i=1;i<=10;i++){
            System.out.println("Main Thread");
        }
    }
}
