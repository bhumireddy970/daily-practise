package com.src.arrays;

public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        int res=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            int num=nums[i];

            if(num<0)
            {
                int temp=max;
                max=min;
                min=temp;
            }

            max=Math.max(num,num*max);
            min=Math.min(num,min*num);

            res=Math.max(res,max);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{-2,-3,-2,-4}));
    }
}
