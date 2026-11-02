package com.src.string;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if(s == null || s.isEmpty())
            return "";
        String longestPalindrome = "";
        for(int i = 0; i < s.length(); i++) {
            String odd=expandFromCenter(s,i,i);
            String even=expandFromCenter(s,i,i+1);
            if(odd.length()>longestPalindrome.length())
                longestPalindrome=odd;
            if(even.length()>longestPalindrome.length())
                longestPalindrome=even;
        }
        return longestPalindrome;
    }

    private static String expandFromCenter(String s,int l,int r) {
        while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
        {
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }
}
