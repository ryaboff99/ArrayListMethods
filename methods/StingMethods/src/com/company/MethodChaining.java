package com.company;

public class MethodChaining { // Chaining - структурування
    public static void main(String[] args){
        String result = "AniMal  ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result);

        // same as this example:

        String start = "AniMal    ";
        String trimmed = start.trim();
        String lowercase = trimmed.toLowerCase();
        String resultone = lowercase.replace('a', 'A');
        System.out.println(resultone);
    }
}
