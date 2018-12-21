package com.company;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");
        StringBuilder same = sb.append("+end");
        System.out.println(sb);
        System.out.println(same); // sb and same refers to same object

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de"); // a and b refers to same object
        b = b.append("f").append("g");
        System.out.println("a=" +a); // abcdefg
        System.out.println("b=" +b); // abcdsefg
        }
    }

