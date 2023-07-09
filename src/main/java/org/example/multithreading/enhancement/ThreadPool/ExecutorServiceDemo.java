/*
 * In the below example, three threads are responsible to execute 6 jobs, so that a single thread can be reused for multiple jobs
 */
package org.example.multithreading.enhancement.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        PrintJob[] jobs = { new PrintJob("Job1"), new PrintJob("Job2"), new PrintJob("Job3"),
                            new PrintJob("Job4"), new PrintJob("Job5"), new PrintJob("Job6")};

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(PrintJob job:jobs){
            executorService.submit(job);
        }

        executorService.shutdown();
    }
}
