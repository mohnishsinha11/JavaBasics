package org.example.multithreading.synchronization;

public class MyThread6 extends Thread{
    Display5 display;
    String name;

    MyThread6(Display5 display, String name){
        this.display = display;
        this.name = name;
    }

    public void run(){
        display.wish(name);
    }
}
