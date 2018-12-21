package com.company;

class MultidimensionalArray { // bagatomirnuy masyv
    public static void main(String[] args) {
        int[][] twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++) { // 3 length and iteretes array indexes
            for (int j = 0; j < twoD[i].length; j++) // 2 length and iteretes array indexes
                System.out.print(twoD[i][j] + " "); // prints values on indexes
            System.out.println();
        }
        // same as:
        for (int[] inner : twoD) {    // gives indexes:0,  0,  1,  1,  2,  2
            for (int num : inner) // gives indexes:00, 01, 10, 11, 20, 21
                System.out.print(num + " ");
            System.out.println();
        }
    }
}
