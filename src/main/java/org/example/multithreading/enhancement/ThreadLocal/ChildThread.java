package org.example.multithreading.enhancement.ThreadLocal;

public class ChildThread extends Thread{
    @Override
    public void run() {
        System.out.println("Child Thread value : " + ParentThread.t1.get() );
    }
}
