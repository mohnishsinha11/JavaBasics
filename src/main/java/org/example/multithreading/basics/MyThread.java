package org.example.multithreading.basics;
// defining a thread using Thread Class
// this approach is not recommended for defining a thread because we will miss on use of inheritance benefit since java
// doesn't support multiple inheritance
public class MyThread extends Thread{

    //job of the thread
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Child Thread");
        }
    }
}
