package org.example.strings;

public class StringExample {
    public static void main(String[] args) {
        String str = "Hello, World!";

        //length(): Returns the length of the string
        int length = str.length();  // Returns 13

        //charAt(int index): Returns the character at the specified index.
        char character = str.charAt(7);  // Returns 'W'

        //substring(int beginIndex): Returns a substring starting from the specified index.
        String substring = str.substring(7);  // Returns "World!"

        //substring(int beginIndex, int endIndex): Returns a substring from the specified begin index (inclusive)
        //to the specified end index (exclusive).
        String substring2 = str.substring(7, 12);  // Returns "World"

        //toLowerCase(): Converts the string to lowercase.
        String lowercase = str.toLowerCase();  // Returns "hello, world!"

        //toUpperCase(): Converts the string to uppercase.
        String uppercase = str.toUpperCase();  // Returns "HELLO, WORLD!"

        //equals(Object obj): Compares the string with the specified object for equality.
        String anotherString = "Hello, World!";
        boolean isEqual = str.equals(anotherString);  // Returns true

        boolean isEqualIgnoreCase = str.equalsIgnoreCase(anotherString);  // Returns true

        boolean startsWith = str.startsWith("Hello");  // Returns true

        boolean endsWith = str.endsWith("World!");  // Returns true

        boolean contains = str.contains("lo");  // Returns true

        int index = str.indexOf("World");  // Returns 7

        String replacedString = str.replace('l', 'z');  // Returns "Hezzo, Worzd!"

        String replacedString2 = str.replaceAll("o", "0");  // Returns "Hell0, W0rld!"

        String stringWithSpaces = "   Hello, World!   ";
        String trimmedString = stringWithSpaces.trim();  // Returns "Hello, World!"
    }
}
