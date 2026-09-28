package com.src.bitwise;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int sum=0;
        for(int n : nums)sum=sum^n;
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(singleNumber(arr));
    }
}
