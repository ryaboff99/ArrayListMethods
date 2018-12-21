package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) { // executes 3 times coz got 3 arrayLists
            INNER_LOOP: for(int i=0; i<mySimpleArray.length; i++) { // iterates 4 times (i=0,i=1,i=2,i=3)
            System.out.print(mySimpleArray[i]+"\t"); // i0=5, i1=2, i2=1, and so on
            }
            System.out.println();
        }
    }
}
