package com.src.Recursion;

public class LengthOfString {
    //Using Recursion
    public static int getLengthOfString(String str) {
        if(str.equals(""))
            return 0;
        return 1 + getLengthOfString(str.substring(1)) ;
    }
    //Using Loop
    public static int getLengthOfStringLoop(String str) {
        int length = 0;
       for(char ch : str.toCharArray()) {
           if(ch==' ')
               break;
           length++;
       }
        return length;
    }
    public static void main(String[] args) {
        System.out.println(getLengthOfString("abcd"));
        System.out.println(getLengthOfStringLoop("abcde"));
    }
}
