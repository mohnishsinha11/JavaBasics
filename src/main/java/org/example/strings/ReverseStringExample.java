package org.example.strings;

public class ReverseStringExample {
    public static void main(String[] args) {
        String str = "hello";

        // Using StringBuilder
        StringBuilder reversedStringBuilder = new StringBuilder(str).reverse();
        String reversedString1 = reversedStringBuilder.toString();

        // Using StringBuffer (thread-safe, but less efficient than StringBuilder)
        StringBuffer reversedStringBuffer = new StringBuffer(str).reverse();
        String reversedString2 = reversedStringBuffer.toString();

        System.out.println("Original String: " + str);
        System.out.println("Reversed String (StringBuilder): " + reversedString1);
        System.out.println("Reversed String (StringBuffer): " + reversedString2);
    }
}
