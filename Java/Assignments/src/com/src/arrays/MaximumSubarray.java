package com.src.arrays;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int currSum=nums[0];
        int farSum=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            currSum=Math.max(nums[i],currSum+nums[i]);
            farSum=Math.max(farSum,currSum);
        }
        return farSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
