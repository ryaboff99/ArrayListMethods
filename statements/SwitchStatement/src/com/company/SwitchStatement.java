package com.company;

public class SwitchStatement {
    public static void main(String[] args) {
        int dayOfWeek = 5;
        switch(dayOfWeek) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday"); //all cases after default wil execute here untill find break
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}
