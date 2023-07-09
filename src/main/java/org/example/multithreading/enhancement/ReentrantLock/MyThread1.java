package org.example.multithreading.enhancement.ReentrantLock;

public class MyThread1 extends Thread{
    Display display;
    String name;

    MyThread1(Display display, String name){
        this.display = display;
        this.name = name;
    }

    public void run(){
        display.wish(name);
    }
}
