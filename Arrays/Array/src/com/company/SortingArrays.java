package com.company;
import java.util.Arrays; // imports just Arrays
// import java.util.*; - import whole package including Arrays

public class SortingArrays {
    public static void main(String[] args) {
        String[] strings = {"10", "9", "100"};
        Arrays.sort(strings);
        for (String string : strings) {
            System.out.print(string + " ");
    }
        System.out.println( " ");

        int[] numbers = { 6, 9, 1 };
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print (numbers[i] + " ");
        }
    }
}
