package com.company;

public class CompareStringStringbuilder {
    public static void main(String[] args){
        StringBuilder alpha = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++){
            alpha.append(current);
            System.out.println(alpha);
        }

        // same as:

        String alphaone = "";
        for(char current = 'a'; current <= 'z'; current++){
            alphaone += current;
            System.out.println(alphaone);
        }
    }
}

