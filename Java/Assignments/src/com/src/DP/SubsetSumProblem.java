package com.src.DP;

public class SubsetSumProblem {
    static boolean isSubsetSum(int arr[], int sum) {
        int n=arr.length;
        boolean[][] dp=new boolean[n][sum+1];
        for(int i=0;i<n;i++) dp[i][0]=true;
        if (arr[0] <= sum) {
            dp[0][arr[0]] = true;
        }

        for(int indx=1;indx<n;indx++)
        {
            for(int target=1;target<=sum;target++)
            {

                boolean notTake=dp[indx-1][target];
                boolean take=false;
                if(arr[indx]<=target)
                    take=dp[indx-1][target-arr[indx]];
                dp[indx][target]=take||notTake;
            }
        }

        return dp[n-1][sum];
    }

    static boolean sol(int arr[], int target,int inx,Boolean[][] dp){
        if(target==0) return true;
        if(inx==0) return(arr[0]==target);

        if(dp[inx][target]!=null) return dp[inx][target];

        boolean notTake=sol(arr,target,inx-1,dp);
        boolean take=false;
        if(arr[inx]<=target)
            take=sol(arr,target-arr[inx],inx-1,dp);

        return dp[inx][target]=take||notTake;
    }
}
