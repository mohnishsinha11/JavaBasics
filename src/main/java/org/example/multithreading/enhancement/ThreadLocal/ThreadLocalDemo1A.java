package org.example.multithreading.enhancement.ThreadLocal;

public class ThreadLocalDemo1A {
    public static void main(String[] args) {
        ThreadLocal threadLocal = new ThreadLocal(){
            public Object initialValue(){
                return "abc";
            }
        };
        System.out.println(threadLocal.get());  //abc
        threadLocal.set("Durga");
        System.out.println(threadLocal.get());  //Durga
        threadLocal.remove();
        System.out.println(threadLocal.get());  //abc
    }
}
