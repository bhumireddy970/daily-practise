package com.src.Recursion;

public class TargetSum {
    public static int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        int count=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum==target){
            count++;
        }
        if(sum>target){
            for(int i=0;i<nums.length;i++){
                if(sum-nums[i]*2==target){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findTargetSumWays(new int[]{1}, 1));
    }
}
