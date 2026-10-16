package com.src.string;

public class FindtheMaximumDivisibilityScore {
    public static int maxDivScore(int[] nums, int[] divisors) {
        int max=0;
        int index = Integer.MAX_VALUE;
        for(int i=0;i<divisors.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]%divisors[i]==0) count++;
            }
            if (count > max) {
                max = count;
                index = divisors[i];
            } else if (count == max) {
                index = Math.min(index, divisors[i]);
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(maxDivScore(new int[]{2,9,15,50},new int[]{5,3,7,2}));
    }
}
