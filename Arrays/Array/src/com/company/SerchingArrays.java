package com.company;

import java.util.Arrays;

public class SerchingArrays {
    public static void main(String[] arg) {
        int[] numbers = {2,4,6,8}; // sorted array, othervise use Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers,4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1 coz 0-1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2 coz -1-1
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5 coz -4-1
    }
}
