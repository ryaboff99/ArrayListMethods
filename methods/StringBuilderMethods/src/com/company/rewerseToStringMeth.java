package com.company;

/** StringBuilder reverse() - reverses the characters
 * String toString() - converts StringBuilder to String*/
public class rewerseToStringMeth {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("ABC");
        sb.reverse();
        System.out.print(sb); // CBA

        sb.toString(); // sb - now String type
    }
}
