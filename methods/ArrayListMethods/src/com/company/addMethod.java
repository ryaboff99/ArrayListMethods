package com.company;
import java.util.ArrayList;

// boolean add(E element)
// void add(int index, E element)

public class addMethod {
    public static void main(String args[]) {
        ArrayList list = new ArrayList();
        list.add("hawk"); // [hawk]
        list.add(Boolean.TRUE); // [hawk, TRUE] can add any objects coz got no type (except primitives)
        System.out.println(list);

        ArrayList<String> birds = new ArrayList<>(); // specifies array as String
        birds.add("hawk"); // [hawk] adds element to the end of array
        birds.add(1,"robin"); // [hawk, robin]
        birds.add(0, "blue jay"); // [blue jay, hawk, robin]
        birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
        // birds.add(Boolean.TRUE); - throws exception coz we specifies array and it can hold only String and Objects
        System.out.println(birds);
    }

}
