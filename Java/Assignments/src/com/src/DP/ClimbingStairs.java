package com.src.DP;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int prev=1;
        int prev2=1;

        for(int i=1;i<n;i++)
        {
            int temp=prev+prev2;
            prev2=prev;
            prev=temp;
        }
        return prev;
    }
}
