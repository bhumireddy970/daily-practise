package com.src.string;

import java.util.Arrays;

public class ReverseStringII {
    public static String reverseStr(String s, int k) {
        int n=s.length();
        char[] arr=s.toCharArray();
        for(int i=0;i<n;i+=2*k){
            int right=Math.min(n-1,i+k-1);
            reverse(arr,i,right);
        }
        return new String(arr);
    }

    public static void reverse(char[] arr,int l,int r)
    {

        while(l<r){
            char temp=arr[l];
            arr[l++]=arr[r];
            arr[r--]=temp;
        }

    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcd", 2));
    }
}
