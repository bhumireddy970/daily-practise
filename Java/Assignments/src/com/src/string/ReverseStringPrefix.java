package com.src.string;

public class ReverseStringPrefix {
    public static String reversePrefix(String s, int k) {
        char[] arr=s.toCharArray();
        int left=0;
        int right=k-1;
        while(left<right)
        {
            char temp=arr[left];
            arr[left++]=arr[right];
            arr[right--]=temp;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(reversePrefix("qabcde", 2));
    }
}
