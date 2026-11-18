package com.src.greedy;

import java.util.Arrays;

public class ShortestJobfirst {
    static int solve(int bt[]) {
        // code here
        int start=0,sum=0,n=bt.length;
        Arrays.sort(bt);

        for(int i=0;i<n;i++)
        {
            sum+=start;
            start+=bt[i];

        }

        return (sum/n);
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{4,3,7,1,2}));
    }
}
