package org.example.strings;

import java.util.Arrays;

//sort a characters present in the string
public class StringSortExample {
    public static void main(String[] args) {
        String str = "hello";

        // Convert the string to a char array
        char[] charArray = str.toCharArray();

        // Sort the char array
        Arrays.sort(charArray);

        // Convert the sorted char array back to a string
        String sortedString = new String(charArray);

        System.out.println("Original String: " + str);
        System.out.println("Sorted String: " + sortedString);
    }
}
