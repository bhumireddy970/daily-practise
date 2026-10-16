package com.src.string;

public class TrimTrailingVowels {
    public static String trimTrailingVowels(String s) {
        int len=s.length()-1;
        while(len>=0&& (s.charAt(len)=='a'|| s.charAt(len)=='e'|| s.charAt(len)=='i'|| s.charAt(len)=='o'|| s.charAt(len)=='u'))
            len--;
        return s.substring(0,len+1);
    }

    public static void main(String[] args) {
        System.out.println(trimTrailingVowels("aeiou"));
    }
}
