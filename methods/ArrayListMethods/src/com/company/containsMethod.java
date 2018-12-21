package com.company;
import java.util.*;

// boolwan contains(Object object) - checks whether a certain value is in the ArrayList

public class containsMethod {
    public static void main(String args[]) {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");                          // [hawk]
        System.out.println(birds.contains("hawk")); // true
        System.out.println(birds.contains("robin")); // false - this method calls equals() on every arreys element to
                                                     // check any mathods, so you can call it too:
    }
}
