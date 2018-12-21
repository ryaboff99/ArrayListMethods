package com.company;

/** charAt(), indexOf(), length(), substring() */

public class ComonWithStringMeth {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al")); // anim
        int len = sb.length(); // 7
        char ch = sb.charAt(6); // s
        System.out.println(sub + " " + len + " " + ch);
    }
}
