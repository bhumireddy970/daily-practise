package com.src.DP;

public class KnapsackProblem {
    public int knapsack(int w, int val[], int wt[]) {
        // code here
        int n=val.length;
        int[][] dp = new int[n][w + 1];
        for(int W=wt[0];W<=w;W++) dp[0][W]=val[0];

        for(int ind=1;ind<n;ind++)
        {
            for(int we=0;we<=w;we++)
            {
                int notTake=dp[ind-1][we];
                int take=Integer.MIN_VALUE;
                if(wt[ind]<=we)
                    take=val[ind]+dp[ind-1][we-wt[ind]];
                dp[ind][we]=Math.max(take,notTake);
            }
        }

        return dp[n-1][w];
    }

    public int sol(int w, int val[], int wt[],int ind,int[][] dp)
    {
        if(ind==0)
        {
            if(wt[ind]<=w) return val[ind];
            else return 0;
        }
        if(dp[ind][w]!=0) return dp[ind][w];
        int notTake=sol(w,val,wt,ind-1,dp);
        int take=Integer.MIN_VALUE;
        if(wt[ind]<=w)
            take=val[ind]+sol(w-wt[ind],val,wt,ind-1,dp);
        return dp[ind][w]=Math.max(take,notTake);
    }
}
