package com.src.arrays;

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            while(nums[i]>0 && nums[i]<=n && nums[i]!=nums[nums[i]-1])
            {
                int correctIndex=nums[i]-1;
                int temp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            }
        }

        for(int i=0;i<n;i++)
        {
            if(nums[i]!=i+1)
                return i+1;
        }

        return n+1;
    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1,2,3,4}));
    }
}
