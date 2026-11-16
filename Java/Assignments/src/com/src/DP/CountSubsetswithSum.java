package com.src.DP;

public class CountSubsetswithSum {
    static int perfectSum(int[] arr, int target) {
        // code here
        int[] dp=new int[target+1];
        dp[0]=1;
        for(int num : arr)
        {
            for(int t=target;t>=num;t--)
                dp[t]+=dp[t-num];
        }
        return dp[target];
    }
}
