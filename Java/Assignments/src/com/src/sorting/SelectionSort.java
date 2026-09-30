package com.src.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int max=i;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max=j;
                }
                int temp = arr[max];
                arr[max] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        sort(new int[]{4,1,5,78,90,12});
    }
}
