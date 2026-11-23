package com.src.greedy;

import java.util.Arrays;

public class FractionalKnapsack {
    public static double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n=val.length;
        int[][] mat=new int[n][2];
        for(int i=0;i<n;i++) {
            mat[i][0] = wt[i];
            mat[i][1] = val[i];
        }
        Arrays.sort(mat, (a, b)->Double.compare((double) b[1] / b[0], (double) a[1] / a[0]));

        System.out.println(Arrays.deepToString(mat));
        double sum=0;
        for(int i=0;i<n;i++) {
            if(mat[i][0]<=capacity) {
                sum+=mat[i][1];
                capacity-=mat[i][0];
            }
            else {
                double temp=((double)(capacity*mat[i][1]))/mat[i][0];
                sum+=temp;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] val = new int[]{60, 100, 120};
        int[] wt = new int[]{10, 20, 30};
        int capacity = 50;

        System.out.println(fractionalKnapsack(val, wt, capacity));
    }
}
