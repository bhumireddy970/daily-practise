package com.src.string;

public class VowelsofAllSubstrings {
    public static long countVowels(String word) {
        char[] arr=word.toCharArray();
        long count=0;
        int n=word.length();
        for(int i=0;i<n;i++)
        {
            if("aeiou".indexOf(arr[i])!=-1)
                count+=(long)((n-i)*(long)(i+1));
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("abc"));
    }
}
