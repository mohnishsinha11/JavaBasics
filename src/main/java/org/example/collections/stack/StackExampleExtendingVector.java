package org.example.collections.stack;

import java.util.Stack;
// the Stack class in Java extends the Vector class, which is considered somewhat old-fashioned.
public class StackExampleExtendingVector {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //push(E item): Adds an item to the top of the stack.
        stack.push(11);
        stack.push(21);
        stack.push(25);

        System.out.println("Current stack size : " + stack.size());

        //peek(): Returns the item at the top of the stack without removing it.
        System.out.println("Current top value : " + stack.peek());

        //pop(): Removes and returns the item at the top of the stack.
        stack.pop();
        System.out.println("Current top value : " + stack.peek());

        //empty(): Returns true if the stack is empty, false otherwise.
        boolean isEmpty = stack.empty();
        System.out.println("Is stack empty : " + isEmpty);

        //search(Object o): Returns the 1-based position of the object from the top of the stack.
        //Returns -1 if the object is not found.
        System.out.println("search 21 in stack : " + stack.search(21));
    }
}

