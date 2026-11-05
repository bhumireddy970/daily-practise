package com.src.arrays;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];

        int prefix=1;

        for(int i=0;i<n;i++)
        {
            res[i]=prefix;
            prefix*=nums[i];
        }

        int suffix=1;

        for(int i=n-1;i>=0;i--)
        {
            res[i]*=suffix;
            suffix*=nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3})));
    }
}
