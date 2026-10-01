package com.src.sorting;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;

        for(int num : nums)
            sum-=num;
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(missingNumber( new int[]{0,2,3,4,5,6}));
    }
}
