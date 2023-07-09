package org.example.multithreading.enhancement.ThreadLocal;

public class InheritableThreadLocalDemo {
    public static void main(String[] args) {
        ParentThread parentThread = new ParentThread();
        parentThread.start();
    }
}
