package com.src.string;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]<nums[i])
                    count++;
            }
            result[i]=count;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8,1,2,2,3})));
    }
}
