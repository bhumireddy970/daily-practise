package com.src.math;

import java.util.Random;

public class ShuffleArray {
    private int[] original;
    private Random rand=new Random();
    public ShuffleArray(int[] nums) {
        original=nums.clone();
    }

    public int[] reset() {
        return original.clone();
    }

    public int[] shuffle() {
        int[] arr=original.clone();
        int n=original.length;
        for(int i=0;i<n;i++)
        {
            int x=rand.nextInt(n);
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    int temp=arr[x];
                    arr[x]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }
}
