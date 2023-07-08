package org.example.multithreading.interthreadcommunication;

public class Thread1 extends Thread{
    int total = 0;

    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            total+=1;
        }
    }
}
