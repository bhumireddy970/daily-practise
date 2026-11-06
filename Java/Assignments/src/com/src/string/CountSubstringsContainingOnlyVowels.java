package com.src.string;

public class CountSubstringsContainingOnlyVowels {
    public static int count(String s1) {
        int count = 0;
        int current = 0;
        for (char c : s1.toCharArray()) {
            if("aeiou".indexOf(c) != -1) {
                current++;
                count+=current;
            }
            else
                current=0;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("aei"));
    }
}
