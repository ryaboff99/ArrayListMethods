package com.company;

/** boolean startsWith(String prefix)
 * boolean endsWith(String suffix) */
public class StartEndWithMethod {
    public static void main(String[] args){
      System.out.println("abc".startsWith("a")); // true
      System.out.println("abc".startsWith("A")); // false
      System.out.println("abc".endsWith("c")); // true
      System.out.println("abc".endsWith("a")); // false
    }
}
