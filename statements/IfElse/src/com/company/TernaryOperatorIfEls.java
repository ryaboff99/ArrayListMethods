package com.company;

public class TernaryOperatorIfEls {
    public static void main(String[] args) {
    int y = 10;
    int x = (y > 5) ? (2 * y) : (3 * y); // first part = if; ? = then; : = else;
        System.out.println(x);
    }

    /**int y = 10; // equivalent as operator
    final int x;
    if(y > 5) {
        x = 2 * y;
    } else {
        x = 3 * y;
    }
     */
}