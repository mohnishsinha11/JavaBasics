package org.example.multithreading.synchronization;

public class MyThread4 extends Thread{
    Display3 display3;
    MyThread4(Display3 display3){
        this.display3 = display3;
    }

    public void run(){
        display3.displayc();
    }
}
