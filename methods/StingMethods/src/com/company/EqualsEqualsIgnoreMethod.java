package com.company;

/** boolean equals(String str)
 * boolean equalsIgnoreCase(String str)
 */
public class EqualsEqualsIgnoreMethod {
    public static void main(String[] args) {
        System.out.println("abc".equals("ABC")); // false
        System.out.println("ABC".equals("ABC")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true
        System.out.println("abd".equalsIgnoreCase("ABC")); // false
    }
}
