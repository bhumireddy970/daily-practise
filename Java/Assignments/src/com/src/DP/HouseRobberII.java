package com.src.DP;

public class HouseRobberII {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int n=nums.length;
        return Math.max(rob1(nums,0,n-1),rob1(nums,1,n));
    }

    public int rob1(int[] nums,int l,int r) {
        int include=nums[l];
        int exclude=0;

        for(int i=l+1;i<r;i++)
        {
            int newExclude=Math.max(include,exclude);
            include=exclude+nums[i];
            exclude=newExclude;
        }

        return Math.max(include,exclude);
    }
}
