package com.src.matrix;

public class LongestIncreasingPathMatrix {
    private int[][] matrix;
    private int[][] dp;
    private int n;
    private int m;

    static int[] dr={-1,1,0,0};
    static int[] dc={0,0,-1,1};
    public int longestIncreasingPath(int[][] matrix) {
        this.matrix=matrix;

        m=matrix.length;
        n=matrix[0].length;

        dp=new int[m][n];
        int res=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                res=Math.max(res,dfs(i,j));
            }
        }
        return res;
    }

    private int dfs(int r,int c)
    {
        if(dp[r][c]!=0)
            return dp[r][c];
        dp[r][c]=1;
        for(int i=0;i<4;i++)
        {
            int nr=r+dr[i];
            int nc=c+dc[i];

            if(nr>=0 && nr<m && nc>=0 && nc<n){

                if(matrix[nr][nc]>matrix[r][c])
                {
                    dp[r][c]=Math.max(dp[r][c],1+dfs(nr,nc));
                }
            }
        }

        return dp[r][c];
    }

    public static void main(String[] args) {
        LongestIncreasingPathMatrix obj=new LongestIncreasingPathMatrix();
        System.out.println(obj.longestIncreasingPath(new int[][]{{9,9,4},{6,6,8},{2,1,1}}));
        System.out.println(obj.longestIncreasingPath(new int[][]{{3,4,5},{3,2,6},{2,2,1}}));
    }
}
