package org.example.multithreading.interthreadcommunication;

public class ThreadDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Thread2 thread = new Thread2();
        thread.start();

        /*
         * wait and notify method must be called in a synchronized block/method otherwise we will get IllegalMonitorStateException.
         *Here we are considering Main thread will start first or will get the lock first and then Main thread will call the
         *wait method before child thread call the notify method.
         *But suppose we make Main thread sleep for some time (like mentioned in below code) and child thread execution got completed first,
         *and it makes notify() call also. Then Main thread will call wait method and goes to waiting state
         *in this scenario Main thread has to wait for forever because execution of child thread got completed
         *and there is no one to notify main thread.
         *
         *To overcome this issue, we can call wait method with parameter 'time' in ms which will tell wait method to wait for atmost 'time' ms
         */

        Thread.sleep(10000);
        synchronized (thread){
            System.out.println("Main thread trying to call wait method");
            thread.wait(10000);
            //thread.wait();
            System.out.println("Main thread got the notification");
            System.out.println("Total : "+ thread.total);
        }
    }
}

// producer consumer problem is other example of inter thread communication