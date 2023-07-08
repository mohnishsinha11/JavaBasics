package org.example.multithreading.basics;
public class ThreadDemo1 {
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();

        for(int i=1;i<=10;i++){
            System.out.println("Main Thread");
        }
    }
}