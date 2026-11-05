package com.src.arrays;

import java.util.Arrays;

public class SortColors {
    public static void sortColors(int[] arr) {
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0)
            {
                int temp=arr[mid];
                arr[mid++]=arr[low];
                arr[low++]=temp;
            }
            else if(arr[mid]==1)
                mid++;
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high--]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        sortColors(new int[]{2,0,2,1,1,0});
    }
}
