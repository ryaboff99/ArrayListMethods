package com.company;
import java.util.*;

/**boolean equals(Object object) - custom implementation, so it can compare two lists to see if they contains same elements
in the same order */

public class equalsMethod {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        System.out.println(one.equals(two));    // true
        one.add("a");                         // [a]
        System.out.println(one.equals(two));  // false
        two.add("a");                         // [a]
        System.out.println(one.equals(two));  // true
        one.add("b");                         // [a, b]
        two.add(0, "b");        // [b, a]
        System.out.println(one.equals(two));   // false, coz values are same, but in different order
        }
    }

