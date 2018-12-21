package com.company;
import java.util.*;

// String[] strungArray = list.toArray(new String[0]);

public class convertingArrayListInArray {
    public static void main(String [] args) {
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray(); // converts ArrayList to Array type Object
        System.out.println(objectArray.length); // 2
        String[] stringArray = list.toArray(new String[0]); // converts ArrayList to String Array
        System.out.println(stringArray.length); // 2
    }
}
