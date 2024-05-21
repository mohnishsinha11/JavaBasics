package org.example.collections.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Creating a PriorityQueue of integers
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        //Max Heap creation
        //PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        // Adding elements to the priority queue
        priorityQueue.add(30);
        priorityQueue.add(20);
        priorityQueue.add(50);
        priorityQueue.add(10);

        System.out.println("PriorityQueue: " + priorityQueue);

        // Removing the highest-priority element (min heap)
        int highestPriority = priorityQueue.poll();
        System.out.println("Removed element with highest priority: " + highestPriority);

        System.out.println("Updated PriorityQueue: " + priorityQueue);

        // Adding elements with custom priorities using a comparator
        PriorityQueue<Integer> customPriorityQueue = new PriorityQueue<>((a, b) -> b - a);
        customPriorityQueue.add(30);
        customPriorityQueue.add(20);
        customPriorityQueue.add(50);
        customPriorityQueue.add(10);

        System.out.println("Custom PriorityQueue: " + customPriorityQueue);

        // Peeking at the highest-priority element without removing it
        int peekedElement = customPriorityQueue.peek();
        System.out.println("Peeked element with highest priority: " + peekedElement);

        System.out.println("Final Custom PriorityQueue: " + customPriorityQueue);
    }
}
