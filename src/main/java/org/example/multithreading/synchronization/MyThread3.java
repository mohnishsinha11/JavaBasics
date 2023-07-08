package org.example.multithreading.synchronization;

public class MyThread3 extends Thread{
    Display3 display3;
    MyThread3(Display3 display3){
        this.display3 = display3;
    }

    public void run(){
        display3.displayn();
    }
}
