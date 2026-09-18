package com.src;

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
}
