package com.Lec6;

import java.util.Arrays;

// to print Array of characters of a string.
public class PrintArrayOfCharactersOfString {
    public static void main(String[] args) {
        String str ="Hi, This is Rajan Raj";
        ArrayOfCharacters(str);
//        ArrayOfCharactersWithoutSpaces(str);
        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));
    }

    // to print array of char with spaces.
    private static void ArrayOfCharacters(String str) {
        char[] arr = str.toCharArray();
        boolean first = true;
        System.out.print("Characters as an array (with spaces): [");
        for (char c : arr) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(c);
            first = false;
        }
        System.out.println("]");
    }
    // to print array of char without spaces.
    private static void ArrayOfCharactersWithoutSpaces(String str){
        // Convert the string to an array of characters
        char[] charArray = str.toCharArray();
        System.out.println(charArray);
        // Print characters as an array (ignoring spaces)
        System.out.print("Characters as an array (ignoring spaces): [");
        boolean first = true;
        for (char ch : charArray) {
            if (ch != ' ') {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print( ch );
                first = false;
            }
        }
        System.out.println("]");
    }
}
