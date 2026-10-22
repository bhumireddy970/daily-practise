package com.src.string;

import java.util.HashSet;


public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
       int left=0;
       int maxLen=0;

       HashSet<Character> set=new HashSet<>();

       for(int r=0;r<s.length();r++){
           if(set.contains(s.charAt(r))){
               set.remove(s.charAt(left));
               left++;
           }
           set.add(s.charAt(r));
           maxLen=Math.max(r-left+1,maxLen);
       }

       return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
