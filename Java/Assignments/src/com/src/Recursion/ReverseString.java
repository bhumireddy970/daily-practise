package com.src.Recursion;

import java.util.Arrays;

public class ReverseString {
    //Reversing a string using recursion
    public static String reverseString(String s) {
        if(s==null || s.length()<=1)
            return s;
        return reverseString(s.substring(1))+s.charAt(0);
    }


    //Reversing a array using two pointer approach
    public static void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left++]=s[right];
            s[right--]=temp;

        }
        System.out.println(Arrays.toString(s));
    }
    public static void main(String[] args) {
        System.out.println(reverseString("Saradhi"));
        char[] ch={'a','b','c','d','e'};
        reverseString(ch);
    }

}
