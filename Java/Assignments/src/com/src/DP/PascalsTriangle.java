package com.src.DP;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        if(numRows==0) return result;
        List<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        for(int i=1;i<numRows;i++)
        {
            List<Integer> curr=new ArrayList<>();
            int ans=1;
            curr.add(1);
            for(int j=1;j<=i;j++)
            {
                ans=ans*(i-j+1);
                ans=ans/j;
                curr.add(ans);
            }
            result.add(curr);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
