package com.src.DP;

public class SuperEggDrop {
    public static int superEggDrop(int k, int n) {
        int[][] dp=new int[n+1][k+1];

        int moves=0;
        while(dp[moves][k]<n){
            moves++;
            for(int i=1;i<=k;i++)
            {
                dp[moves][i]=dp[moves-1][i-1]+dp[moves-1][i]+1;
            }
        }
        return moves;
    }

    public static void main(String[] args) {
        System.out.println(superEggDrop(1, 2));
    }
}
