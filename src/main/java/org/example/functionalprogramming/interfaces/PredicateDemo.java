package org.example.functionalprogramming.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        // predicate for checking whether number is even or odd
        Predicate<Integer> predicate = t -> (t%2 == 0);
        System.out.println(String.format("Test whether %d is even : " + predicate.test(5),5));

        //below code will print list of even numbers
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream().filter(t-> (t%2 ==0)).forEach(t-> System.out.println("Even Number : " + t));
    }
}
