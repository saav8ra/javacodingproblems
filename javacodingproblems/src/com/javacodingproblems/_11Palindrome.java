package com.javacodingproblems;

public class _11Palindrome {

    public static void main(String[] args) {

        String inputString = "racecar";

        StringBuilder sb = new StringBuilder(inputString);
        sb.reverse();

        if (sb.toString().equals(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }

    }

}
