package com.src.DP;

import java.util.Arrays;

public class FrogJump {
    static int minCost(int[] height) {
        return helper(height,height.length-1);
    }

    static int helper(int[] height,int n){
        if(n==0) return 0;
        int once=0,twice=Integer.MAX_VALUE;
         once=helper(height,n-1)+Math.abs(height[n]-height[n-1]);
        if(n>1)
             twice=helper(height,n-2)+Math.abs(height[n]-height[n-2]);
        return Math.min(once,twice);
    }

    static int minCostdp(int[] height) {
        int dp[]=new int[height.length];
        Arrays.fill(dp,-1);
        return helperdp(height,height.length-1,dp);
    }

    static int helperdp(int[] height,int n,int[] dp){
        if(n==0) return 0;
        if(dp[n]!=-1) return dp[n];
        int once=helperdp(height,n-1,dp)+Math.abs(height[n]-height[n-1]);
        int twice=Integer.MAX_VALUE;
        if(n>1)
            twice=helperdp(height,n-2,dp)+Math.abs(height[n]-height[n-2]);

        return dp[n]=Math.min(once,twice);
    }

    static int minCostdp2Tabulation(int[] height) {
        int prev=0;
        int prev2=prev;

        for(int i=1;i<height.length;i++){
            int right=prev+Math.abs(height[i]-height[i-1]);
            int left=Integer.MAX_VALUE;
            if(i>1)
                left=prev2+Math.abs(height[i]-height[i-2]);
            prev2=prev;
            prev=Math.min(left,right);
        }
        return prev;
    }

    public static void main(String[] args) {
        System.out.println(minCost(new int[]{30, 20, 50, 10, 40}));
        System.out.println(minCostdp(new int[]{30, 20, 50, 10, 40}));
        System.out.println(minCostdp2Tabulation(new int[]{30, 20, 50, 10, 40}));
    }
}
