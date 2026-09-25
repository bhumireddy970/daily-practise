package com.src.Recursion;

public class IsArraySorted {
    public static boolean isArraySorted(int[] arr,int index) {
        if (index <= 0) {
            return true;
        }

        if (arr[index] < arr[index-1]) {
            return false;
        }

        return isArraySorted(arr, index - 1);

    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,10,1};
        System.out.println(isArraySorted(arr,arr.length-1));
    }
}
