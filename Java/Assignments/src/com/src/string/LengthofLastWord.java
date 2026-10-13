package com.src.string;

public class LengthofLastWord {
    public static int lengthOfLastWord(String s) {
        int count=0;
        s=s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord( "a"));
    }
}
