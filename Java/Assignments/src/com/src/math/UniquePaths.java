package com.src.math;

public class UniquePaths {
    public static int uniquePaths(int m, int n) {
        //bottom-up approach DP

        int[][] result = new int[m][n];
        for(int i=0;i<m;i++)
            result[i][n-1] = 1;
        for(int i=0;i<n;i++)
            result[m-1][i] = 1;
        for(int i=m-2;i>=0;i--)
        {
            for (int j=n-2;j>=0;j--){
                result[i][j] = result[i+1][j] + result[i][j+1];
            }
        }
        return result[0][0];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,2));
    }
}
