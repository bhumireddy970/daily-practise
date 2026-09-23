package com.src.Recursion;

public class FirstUppercaseLetter {
    //Linear search
    public static char getFirstUppercaseLetterLinear(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                return str.charAt(i);
            }
        }
        return 0;
    }

    //recursion
    public static char getFirstUppercaseLetterRecursion(String str,int index) {
        if(index == str.length()) {
            return 0;
        }
        if(str.charAt(index) >= 'A' && str.charAt(index) <= 'Z') {
            return str.charAt(index);
        }

        return getFirstUppercaseLetterRecursion(str, index + 1);
    }


    public static void main(String[] args) {
        char result = getFirstUppercaseLetterLinear("ABC");
        if(result == 0)
            System.out.println("No Uppercase Letter Found");
        else
            System.out.println(result);
        result = getFirstUppercaseLetterRecursion("abcd", 0);
        if(result == 0)
            System.out.println("No Uppercase Letter Found");
        else
            System.out.println(result);
    }
}
