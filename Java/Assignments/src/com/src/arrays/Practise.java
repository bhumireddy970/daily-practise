package com.src.arrays;

public class Practise {
    public static int largest(int [] arr){
        int max=Integer.MIN_VALUE;
        for(int num : arr)
            max=Math.max(max,num);
        return max;
    }
    public static int smallest(int [] arr){
        int min=Integer.MAX_VALUE;
        for(int num : arr)
            min=Math.min(min,num);
        return min;
    }
    public static int secondLargest(int [] arr){
        if (arr == null || arr.length < 2) return -1;
        int lar=Integer.MIN_VALUE;
        int secLar=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                secLar=lar;
                lar=arr[i];

            }
            else if(arr[i]>secLar && arr[i]!=lar){
                secLar=arr[i];
            }
        }
        return (secLar == Integer.MIN_VALUE) ? -1 : secLar;
    }

    public static void main(String[] args) {
        System.out.println(largest(new int[]{10,25,7,40,15}));
        System.out.println(smallest(new int[]{10,25,7,40,15}));
        System.out.println(secondLargest(new int[]{10,5,8}));

    }
}
