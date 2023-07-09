package org.example.multithreading.deadlock;

//This program will demonstrate deadlock
// Deadlock cannot be resolved it can only be prevented
//synchronized keyword is the only reason for deadlock situation due to this while using synchronized keyword we need to take special care
public class DeadLock extends Thread{
    A a = new A();
    B b = new B();

    public void m1(){
        this.start();
        a.d1(b); // this will be called by Main Thread
    }

    public void run(){
        b.d2(a); // this will be called by Child Thread
    }

    public static void main(String[] args) {
        DeadLock thread = new DeadLock();
        thread.m1();
    }
}
