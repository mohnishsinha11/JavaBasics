package org.example.multithreading.enhancement.ThreadLocal;

public class ParentThread extends Thread{
    public static InheritableThreadLocal t1 = new InheritableThreadLocal(){
        @Override
        public Object childValue(Object p) {
            return "CC";
        }
    };

    public void run(){
        t1.set("PP");
        System.out.println("parent Thread Value : "+ t1.get());
        ChildThread ct = new ChildThread();
        ct.start();
    }
}
