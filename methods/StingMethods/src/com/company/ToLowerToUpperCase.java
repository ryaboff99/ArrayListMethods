package com.company;

/** String toLowerCase(String str)
 * String toUpperCase(String str) */

public class ToLowerToUpperCase {
    public static void main(String[] args){
        String string = "animals";
        System.out.println(string.toUpperCase()); // ANIMALS
        System.out.println("Abc123".toLowerCase()); // abc123
        System.out.println(string); // but string is immutable and stays same "animals"
        System.out.println(string = string.toUpperCase());
    }
}
