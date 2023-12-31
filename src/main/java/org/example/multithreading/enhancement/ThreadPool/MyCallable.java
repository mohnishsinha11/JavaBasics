package org.example.multithreading.enhancement.ThreadPool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    int num;
    MyCallable(int num){
        this.num = num;
    }

    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "... is responsible for getting sum of first "+ num +" numbers");
        int sum = 0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        return sum;
    }
}
