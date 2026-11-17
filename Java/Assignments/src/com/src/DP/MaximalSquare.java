package com.src.DP;

public class MaximalSquare {
    public static int maximalSquare(char[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[][] dp=new int[rows][cols];
        int maxLen=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(matrix[i][j]=='1')
                {
                    if(i==0 || j==0)
                        dp[i][j]=1;
                    else{
                        dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
                    }
                }
                maxLen=Math.max(maxLen,dp[i][j]);
            }
        }
        return maxLen*maxLen;
    }

    public static void main(String[] args) {
        char[][] matrix = new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        System.out.println(maximalSquare(matrix));
    }
}
