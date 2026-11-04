package com.src.arrays;

import java.util.Arrays;

public class FindMissingRepeatedValues {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int r=grid.length;
        int[] arr=new int[(r*r)+1];
        for(int[] row:grid){
            for(int col:row){
                arr[col]++;
            }
        }
        int rep=0,mis=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==0)
                mis=i;
            if(arr[i]==2)
                rep=i;
        }

        return new int[]{rep,mis};

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(new int[][]{{1,3},{2,2}})));
    }
}
