package com.company;
import java.util.*;

// E set(int index, E newElement) - changes element without changing size

public class setMethod {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");                // [hawk]
        System.out.println(birds.size()); // 1 size
        birds.set(0, "robin");            // [robin]
        System.out.println(birds.size()); // 1 size
        // birds.set(1, "robin"); // throws exception coz size 1 and it is only one valid index - 0
    }
}
