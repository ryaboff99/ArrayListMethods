package com.company;

public class ForEachStatement2 {
    public static void main(String[] args) {
        int[] values = new int[3];
        values[0] = 10;
        values[1] = new Integer(5);
        values[2] = 15;
        for (int i=1; i<values.length; i++) {
            System.out.print(values[i] - values[i-1]); /** values[i-1] =  попереднє до values[i] значення, тобто якщо
                                                       values[1] = 10, то values[i-1] = 10 */
        }
    }
}
