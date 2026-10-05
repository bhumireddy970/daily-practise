package com.src.sorting;

import java.util.Arrays;

public class MaximumProductofThreeNumbers {
    public static int maximumProduct(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);

        int poss1=nums[len-1]*nums[len-2]*nums[len-3];
        int poss2=nums[0]*nums[1]*nums[len-1];

        return Math.max(poss1,poss2);
    }

    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{-100,-2,-3,1}));
    }
}
