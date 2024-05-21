package org.example.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(15);
        queue.add(11);
        queue.add(12);
        queue.add(13);
        queue.add(21);
        System.out.println("Queue status : "+ queue);
        System.out.println("Queue front element : " + queue.peek());
        queue.remove();
        System.out.println("Queue status : "+ queue);

        //poll(): Removes and returns the element at the front of the queue. Returns null if the queue is empty.
        queue.poll();
        System.out.println("Queue status after using poll() : "+ queue);
    }
}
