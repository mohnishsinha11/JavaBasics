package org.example.garbagecollection;

import java.util.Date;

public class RuntimeDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println("Total memory : " + r.totalMemory());
        System.out.println("Free memory : " + r.freeMemory());
        for(int i=1;i<=10000;i++){
            Date d = new Date();
            d = null;
        }

        System.out.println("Free memory before gc : " + r.freeMemory());
        r.gc();
        System.out.println("Free memory after gc : " + r.freeMemory());
    }
}
