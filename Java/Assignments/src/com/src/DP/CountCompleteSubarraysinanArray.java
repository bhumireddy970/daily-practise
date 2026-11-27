package com.src.DP;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountCompleteSubarraysinanArray {
    public static int countCompleteSubarrays(int[] nums) {
        int k=(int) Arrays.stream(nums).distinct().count(),res=0;
        for(int i=0;i<nums.length;i++)
        {
            Set<Integer> set=new HashSet<>();
            for(int j=i;j<nums.length;j++)
            {
                set.add(nums[j]);
                if(set.size()==k) res++;
            }
        }
        return res++;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 1, 2, 2};
        System.out.println(countCompleteSubarrays(nums));
    }
}
