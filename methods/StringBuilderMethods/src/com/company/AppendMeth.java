package com.company;

/** append() */

public class AppendMeth {
    public static void main(String [] args) {
        StringBuilder sb = new StringBuilder().append(1).append('c'); // create S-builder then append "1" and "c"
        sb.append("-").append(true); // append "-" and "true"
        System.out.println(sb);
    }
}
