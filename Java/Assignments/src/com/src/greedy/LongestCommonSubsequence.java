package com.src.greedy;

import java.util.Arrays;

public class LongestCommonSubsequence {
    public static int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();

        int[][] dp=new int[m][n];
        for(int[] row : dp)
            Arrays.fill(row,-1);
        return sol(text1,text2,m-1,n-1,dp);
    }
    public static int sol(String text1, String text2,int i,int j ,int[][] dp)
    {
        if(i<0 || j<0) return 0;

        if(dp[i][j]!=-1) return dp[i][j];
        if(text1.charAt(i)==text2.charAt(j))
            return dp[i][j]=1+sol(text1,text2,i-1,j-1,dp);

        return dp[i][j]=Math.max(sol(text1,text2,i-1,j,dp),sol(text1,text2,i,j-1,dp));
    }

    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(longestCommonSubsequence(text1,text2));
    }
}
