package com.src.Recursion;

public class BinarySearch {

    public static int binarySearch(int[] arr,int low,int high,int key ){
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(key>arr[mid]){
            return binarySearch(arr,mid+1,high,key);
        }
        if(key<arr[mid]){
            return binarySearch(arr,low,mid-1,key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr,0,arr.length-1,3));
    }
}
