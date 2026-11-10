package com.src.sorting;

import java.util.Arrays;

public class QuickSort {
    public  static void quickSort(int[] arr,int left,int right){
        if(left<right){
            int pivot=partition(arr,left,right);

            quickSort(arr,left,pivot-1);
            quickSort(arr,pivot+1,right);
        }
    }
    public static int partition(int[] arr,int left,int right){
       int pivot=arr[right];
       int low=(left-1);

       for(int i=left;i<right;i++){
           if(arr[i]<pivot){
               low++;
               int temp=arr[low];
               arr[low]=arr[i];
               arr[i]=temp;
           }
       }
       int temp=arr[low+1];
       arr[low+1]=arr[right];
       arr[right]=temp;

       return low+1;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{100000,999999999,200,3,1,0,55,67};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
