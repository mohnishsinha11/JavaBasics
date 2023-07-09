package org.example.multithreading.enhancement.ThreadLocal;

public class ThreadLocalDemo1 {
    public static void main(String[] args) {
        ThreadLocal threadLocal = new ThreadLocal<>();
        System.out.println(threadLocal.get());  //null
        threadLocal.set("Durga");
        System.out.println(threadLocal.get());  //Durga
        threadLocal.remove();
        System.out.println(threadLocal.get());  //null
    }
}
