package com.company;

/** String replace(char oldChar, char newChar) - does search and replace on the String
 * String replace(CharSequence oldChar, CharSequence newChar) */

public class ReplaceMethod {
    public static void main(String[] args) {
        System.out.println("abcabc".replace('a', 'A')); //AbcAbc
        System.out.println("abcabc".replace("a", "A")); //AbcAbc
    }
}
