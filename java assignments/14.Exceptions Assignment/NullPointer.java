
//15.Write a program to generate NullPointerException



package com.jala.exceptions;
public class NullPointer {
    static void simpleNullCheck(String str) {
        System.out.println(str.length());
    }

    public static void main(String args[]) {
            System.out.println("declaring object with null");
        String input = null;
        try {
            simpleNullCheck(input);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            e.printStackTrace();
        }
    }
}