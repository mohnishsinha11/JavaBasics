package org.example.multithreading.synchronization;

public class MyThread2 extends Thread{
    Display2 display;
    String name;

    MyThread2(Display2 display, String name){
        this.display = display;
        this.name = name;
    }

    public void run(){
        // static methods can also be invoked with object instances
        //both the code below will give same output

        display.wish(name);
        //Display2.wish(name);
    }
}
