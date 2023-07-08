package org.example.multithreading.synchronization;

public class MyThread1 extends Thread{
    Display1 display;
    String name;

    MyThread1(Display1 display, String name){
        this.display = display;
        this.name = name;
    }

    public void run(){
        display.wish(name);
    }
}
