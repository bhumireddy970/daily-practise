package com.src.string;

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        StringBuilder word3 = new StringBuilder();
        while(i<word1.length() && j<word2.length()){
            word3.append(word1.charAt(i++));
            word3.append(word2.charAt(j++));
        }
        while(i<word1.length())
            word3.append(word1.charAt(i++));
        while(j<word2.length())
            word3.append(word2.charAt(j++));

        return word3.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc","pqr"));
    }
}
