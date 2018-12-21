package com.company;
import java.util.*;

//boolean isEmpty()
// int size()

public class isEmptySizeMethods {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        System.out.println(birds.isEmpty()); // prints true
        System.out.println(birds.size()); // prints 0
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.isEmpty()); // false
        System.out.println(birds.size()); // 2
    }
}
