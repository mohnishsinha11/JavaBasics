package org.example.multithreading.basics;
/*
 * Thread class provides the join() method which allows one thread to wait until another thread completes its execution.
 * If t is a Thread object whose thread is currently executing, then t. join() will make sure that t is terminated before
 * the next instruction is executed by the program.
 */
public class ThreadJoinDemo1 {
    public static void main(String[] args) throws InterruptedException {
        MyThreadForJoinDemo thread = new MyThreadForJoinDemo();
        thread.start();

        thread.join();
        //if we provide parameter 'time' in ms while invoking join method then it will wait for atmost 'time' for the other thread
        //thread.join(5000);
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
