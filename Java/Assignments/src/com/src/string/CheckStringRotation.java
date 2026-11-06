package com.src.string;

public class CheckStringRotation {
    public static boolean isItRotation(String s1, String s2) {
        return s1.length() == s2.length() && (s1+s1).contains(s2);
    }

    public static void main(String[] args) {
        System.out.println(isItRotation("abcd","cdab"));
    }
}
