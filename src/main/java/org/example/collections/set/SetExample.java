package org.example.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
   *
 */
public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        //add(E e): Adds the specified element to the set if it is not already present.
        set.add("Apple");
        set.add("Banana");
        set.add("Grapes");
        set.add("Mango");
        System.out.println("Set status : " + set);

        //remove(Object o): Removes the specified element from the set if it is present.
        set.remove("Grapes");
        System.out.println("Set status : " + set);

        //contains(Object o): Returns true if the set contains the specified element.
        boolean contains = set.contains("Apple");
        System.out.println("Check if Set contains Apple : " + contains);

        //isEmpty(): Returns true if the set contains no elements.
        boolean isEmpty = set.isEmpty();
        System.out.println("Check if Set is empty : " + isEmpty);

        //size(): Returns the number of elements in the set.
        //clear(): Removes all elements from the set.

        Set<String> anotherSet = new HashSet<>();
        anotherSet.add("Strawberry");
        anotherSet.add("Orange");

        //addAll(Collection<? extends E> c): Adds all of the elements in the specified collection to the set.
        set.addAll(anotherSet);
        System.out.println("Set status : " + set);

        //equals(Object o): Compares the specified object with the set for equality.
        boolean isEqual = set.equals(anotherSet);
        System.out.println("Set status : " + set);

        //removeAll(Collection<?> c): Removes all of the elements from the set that are present in the specified collection.
        set.removeAll(anotherSet);
        System.out.println("Set status : " + set);

        set.addAll(anotherSet);
        //retainAll(Collection<?> c): Retains only the elements in the set that are present in the specified collection.
        set.retainAll(anotherSet);
        System.out.println("Set status : " + set);

        System.out.println("------------------------");
        set.add("Apple");
        set.add("Banana");
        set.add("Grapes");
        set.add("Mango");
        //set iteration
        for (String element : set) {
            System.out.println(element);
        }

        System.out.println("------------------------");
        //using Iterator
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
