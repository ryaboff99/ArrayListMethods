package com.company;

/** search for chars and return PARTS of the String
 * int substring(int beginIndex)
 * int substring(int beginIndex, index fromIndex)*/

public class SubstringMethod {
    public static void main(String[] args) {
        String string = "animals";
        System.out.println(string.substring(3)); // "mals"
        System.out.println(string.substring(string.indexOf('m'))); // "mals"
        System.out.println(string.substring(3, 4)); // "m"
        System.out.println(string.substring(3, 7)); // "mals" 7 - is the "end of string" (invisible position) so it ligable
        System.out.println(string.substring(3, 3)); // empty String
        // System.out.println(string.substring(3, 2)); // throws exeption
        //System.out.println(string.substring(3, 8)); // throws exeption
    }
}
