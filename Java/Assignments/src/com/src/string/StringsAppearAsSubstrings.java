package com.src.string;

public class StringsAppearAsSubstrings {
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String str:patterns){
            if(word.contains(str))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] patterns={"a","b","c"};
        System.out.println(numOfStrings(patterns,"aaaaabbbbb"));
    }

    public static class ReverseWordsInString {
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
}
