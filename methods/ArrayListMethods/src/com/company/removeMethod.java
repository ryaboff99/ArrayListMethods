package com.company;
import java.util.*;

// boolean remove(Object object)
// E remove(int index)

public class removeMethod {
    public static void main(String args[]) {
        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.remove("cardinal")); // prints false coz no cardinal in array
        System.out.println(birds.remove("hawk")); // prints true coz have hawk in the array
        System.out.println(birds.remove(0)); // prints hawk coz hawk is on index 0
        //birds.remove(100); // will throw exception coz no such index in the array
        System.out.println(birds); // prints [] coz no values now in the array
    }
}
