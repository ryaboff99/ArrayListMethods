package com.company;

public class Main {
    public static void main(String[] args) {
        int dayOfWeek = 5;
        switch(dayOfWeek) {
            default:
                System.out.println("Weekday");
                break; //optional eweywhere but output will be diferent
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}
/** Data types supported by switch statements:
 * int, Integer
 * byte, Byte
 * short, Short
 * char, Character
 * String
 * enum values
 *
 * can use only literals, enum constants, final constant variables, all with same data type*/