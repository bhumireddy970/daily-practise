package com.src.DP;

import java.util.ArrayList;

public class TrianglePathSum {
    public int minSumPath(ArrayList<ArrayList<Integer>> triangle) {
        int n=triangle.size();

        for(int i=n-2;i>=0;i--)
        {
            for(int j=0;j<triangle.get(i).size();j++)
            {
                int up=triangle.get(i+1).get(j);
                int diag=triangle.get(i+1).get(j+1);

                int curr=triangle.get(i).get(j);
                triangle.get(i).set(j,curr+Math.min(up,diag));
            }
        }
        return triangle.get(0).get(0);

    }
}
