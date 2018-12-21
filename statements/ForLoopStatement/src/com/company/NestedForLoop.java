package com.company;

public class NestedForLoop {
    public static void main(String[] args){
        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
         for(int[] mySimpleArray : myComplexArray) { // first executes assigment then execute loop body
             for(int i=0; i<mySimpleArray.length; i++) { // iterates 4 times coz mySimpleArray now got 4 values
                 System.out.print(mySimpleArray[i] + "\t"); // take i as argument. i0 = 5, i1 = 2, i3 = 1, and so on
             }
            System.out.println();
        }
    }
}
