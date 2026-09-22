package com.src.Recursion;

import java.util.Arrays;

public class SumTriangleArray {

    public static void generate(int[] arr) {
        if(arr.length<1)
            return;
        int[] arr2 = new int[arr.length-1];
        for(int i=0;i<arr2.length;i++)
        {
           arr2[i]=arr[i]+arr[i+1];
        }
        generate(arr2);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        generate(arr);
    }
}
