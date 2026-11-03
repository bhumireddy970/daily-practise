package com.src.arrays;

public class MissingEmployeeID {
    public static int missEmployeeID(int n,int[] arr) {
        if(arr == null || arr.length == 0)
            return 0;
        if(n == 1) return 1;
        int sum=0;
        for(int num : arr)
            sum+=num;
        int total =(n*(n+1))/2;
        return total-sum;
    }
    public static void main(String[] args) {
        System.out.println(missEmployeeID(5,new int[]{1, 2, 3, 5}));
    }
}
