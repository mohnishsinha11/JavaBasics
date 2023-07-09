package org.example.multithreading.enhancement.ThreadGroup;
/*
 * Main thread belongs to main group
 * Every thread in java is child group of system group either directly or indirectly
 * Hence system group access all root ThreadGroups in java
 */
public class ThreadGroupDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent());

        //it will create a new ThreadGroup with name "First Group"
        //the parent of this new group is the parent group of currently executing thread
        ThreadGroup threadGroup1 = new ThreadGroup("First Group");
        System.out.println(threadGroup1.getParent().getName());      // main

        //it will create a threadgroup with name "Second Thread" and parent will be threadGroup1
        ThreadGroup threadGroup2 = new ThreadGroup(threadGroup1, "Second Group");
        System.out.println(threadGroup2.getParent().getName());      //First Group
    }
}
