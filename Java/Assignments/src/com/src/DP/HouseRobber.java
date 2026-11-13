package com.src.DP;

public class HouseRobber {
    public int rob(int[] nums) {
        int include=nums[0];
        int exclude=0;

        for(int i=1;i<nums.length;i++)
        {
            int newExclude=Math.max(include,exclude);
            include=exclude+nums[i];
            exclude=newExclude;
        }

        return Math.max(include,exclude);
    }
}
