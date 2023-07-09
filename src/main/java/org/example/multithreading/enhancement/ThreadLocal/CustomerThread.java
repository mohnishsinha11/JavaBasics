package org.example.multithreading.enhancement.ThreadLocal;

public class CustomerThread extends Thread{
    static Integer custId = 0;
    private static ThreadLocal t1 = new ThreadLocal<>(){
        protected Integer initialValue() {
            return ++custId;
        }
    };

    CustomerThread(String name){
        super(name);
    }

    public void run(){
        System.out.println(Thread.currentThread().getName() + " executing with customer Id : " + t1.get());
    }
}
