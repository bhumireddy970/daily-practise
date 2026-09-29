package com.src.bitwise;

import java.util.Arrays;

public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        int missing=0;
        int duplicate=0;
        int[] freq=new int[nums.length+1];

        for (int num : nums) freq[num]++;

        for(int i=0;i<=nums.length;i++){
            if(freq[i]==2) duplicate=i;
            else if(freq[i]==0) missing=i;
        }
        return new int[]{duplicate,missing};
    }

    public static void main(String[] args) {
        int[] nums1 = {1,1};
        System.out.println(Arrays.toString(findErrorNums(nums1)));
    }
}
