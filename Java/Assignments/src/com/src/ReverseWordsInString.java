package com.src;

import java.util.Arrays;

public class ReverseWordsInString {
    public static String reverseWords(String s) {
        String result="";
        for(String str : s.split(" ")){
            StringBuilder sb = new StringBuilder(str);
                result += sb.reverse().toString()+" ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
