package org.example.multithreading.synchronization;

public class MyThread5 extends Thread{
    Display4 display;
    String name;

    MyThread5(Display4 display, String name){
        this.display = display;
        this.name = name;
    }

    public void run(){
        display.wish(name);
    }
}
