package com.src.DP;

import java.util.Arrays;

public class Minimumcoins {
    public static int MinimumCoins(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] row : dp)
            Arrays.fill(row,-1);
        int ans= sol(coins,amount,n-1,dp);

        return ans>=Integer.MAX_VALUE-1?-1:ans;
    }

    public static int sol(int[] coins, int amount,int ind,int[][] dp)
    {
        if(ind==0)
        {
            if(amount%coins[ind]==0) return amount/coins[ind];
            else return Integer.MAX_VALUE-1;
        }
        if(dp[ind][amount]!=-1) return dp[ind][amount];
        int notTake=sol(coins,amount,ind-1,dp);
        int take=Integer.MAX_VALUE;
        if(coins[ind]<=amount)
            take=1+sol(coins,amount-coins[ind],ind,dp);
        return dp[ind][amount]=Math.min(notTake,take);
    }

    public static void main(String[] args) {
        int[] coins={1,2,3,4};
        int amount=8;
        System.out.println(MinimumCoins(coins,amount));
    }
}
