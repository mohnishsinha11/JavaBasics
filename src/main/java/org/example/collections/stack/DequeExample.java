package org.example.collections.stack;

import java.util.*;

/*
    Remember that the Stack class in Java extends the Vector class, which is considered somewhat old-fashioned.
    In modern Java programming, it's often recommended to use the Deque interface for stack-like behavior.
 */
public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(21);
        stack.push(11);
        stack.push(10);

        int top = stack.pop();
        System.out.println("Stack Top : " + top);

        int peek = stack.peek();
        System.out.println("Current Stack using peek() : " + peek);

        boolean isEmpty = stack.isEmpty();
        System.out.println("If Stack is empty : " + isEmpty);

        System.out.println("Stack top element using poll : " + stack.poll());
        System.out.println("Stack top element after using poll : " + stack.peek());
        stack.push(25);
        System.out.println("Stack top element : " + stack.peek());
        System.out.println("Stack all elements : " + stack);

        //add method appends element at last in deque
        stack.add(5);
        stack.push(11);
        System.out.println("Stack all elements : " + stack);
        stack.pop();
        System.out.println("Stack all elements : " + stack);
    }
}
