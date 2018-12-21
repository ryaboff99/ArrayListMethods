package com.company;

/** at char-s in string and finds first that matches the desire value
 * int indexOf(char ch) looks
 * int indexOf(char ch, index fromIndex)
 * int indexOf(String str)
 * int indexOf(String str, index fromIndex)*/

public class IndexOfMethod {
    public static void main(String[] args){
        String string = "animals";
        System.out.println(string.indexOf('a')); // 0
        System.out.println(string.indexOf("al")); // 4
        System.out.println(string.indexOf('a', 4)); // 4 - shouldn't look at the char-s until it gets to index 4
        System.out.println(string.indexOf("al", 5)); // -1  - throws when doesn't find anything,
                                                                     //coz starts looking after the match occurred
    }
}
