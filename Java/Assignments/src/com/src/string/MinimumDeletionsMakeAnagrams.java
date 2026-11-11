package com.src.string;

public class MinimumDeletionsMakeAnagrams {
    public static int countDeletions(String str1, String str2) {
        int[] freq = new int[26];

        for(char ch : str1.toCharArray()){
            freq[ch - 'a']++;
        }
        for(char ch : str2.toCharArray()){
            freq[ch - 'a']--;
        }

        int result = 0;
        for(int val : freq){
            result += Math.abs(val);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countDeletions("aaa", "a"));
    }
}
