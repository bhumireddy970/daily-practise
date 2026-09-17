package com.src;

public class CheckIfTwoStringArraysareEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1= new StringBuilder();
        StringBuilder s2= new StringBuilder();
        for(String s : word1)
        {
            s1.append(s);
        }
        for(String s : word2)
        {
            s2.append(s);
        }

        return s1.toString().contentEquals(s2);

    }

    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
