package com.company;
import java.util.*;

// void clear()

public class clearMethod {
    public static void main(String[] args) {
     List<String> birds = new ArrayList<>();
     birds.add("hawk");                   // [hawk]
     birds.add("hawk");                   // [hawk, hawk]
     System.out.println(birds.isEmpty()); // false
     System.out.println(birds.size());    // 2
     birds.clear();                       // []
     System.out.println(birds.isEmpty()); // true
     System.out.println(birds.size());    // 0
    }
}
