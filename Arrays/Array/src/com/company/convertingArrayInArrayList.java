package com.company;
import java.util.*;

// List<String> list = Arrays.asList(array);

public class convertingArrayInArrayList {
    public static void main(String[] args) {
        String[] array = {"hawk", "robin"}; // [hawk, robin]
        List<String> list = Arrays.asList(array); // converts ArrayList to Array and returns fixed size list
        System.out.println(list.size()); // 2
        list.set(1, "test"); // [hawk, test]
        array[0] = "new"; // [new, test]
        for (String b : array) System.out.print(b + " "); // new test
        //list.remove(1); - throws exception
    }
}
