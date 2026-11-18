package com.src.DP;

public class Rodcuttingproblem {
    public static int RodCutting(int price[], int n) {
        int len=price.length;
        int[][] dp=new int[len][n+1];
        return sol(price,n,len-1,dp);
    }

    public static int sol(int price[], int n,int ind,int[][] dp)
    {
        if(ind==0)
            return n*price[0];
        if(dp[ind][n]!=0) return dp[ind][n];

        int noTake=sol(price,n,ind-1,dp);
        int take=Integer.MIN_VALUE;
        int rodLen=ind+1;
        if(rodLen<=n)
            take=price[ind]+sol(price,n-rodLen,ind,dp);

        return dp[ind][n]=Math.max(noTake,take);
    }

    public static void main(String[] args) {
        int[] price={1, 6, 8, 9, 10, 19, 7, 20};
        System.out.println(RodCutting(price,8));
    }
}
