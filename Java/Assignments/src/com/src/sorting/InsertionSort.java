package com.src.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1]=arr[j--];
            }
            arr[j+1]=key;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        sort(new int[]{4,1,5,78,90,12});
    }
}
