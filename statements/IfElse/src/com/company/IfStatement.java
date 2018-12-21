package com.company;

public class IfStatement {
    public static void main(String[] args) {

        int hourOfDay = 0;
        int morningGreetingCount = 0;

        if (hourOfDay < 11) { // <--- bracer required for 2 and more statements and optional for 1 statement
            System.out.println("Good Morning");
            morningGreetingCount ++;
        } // <--- bracer required for 2 and more statements and optional for 1 statement
        System.out.println(morningGreetingCount);
    }
}
