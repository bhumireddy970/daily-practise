package com.src.sorting;

import java.util.Arrays;

public class SortArrayByParityII {
    public static int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length;

        while (i < n && j < n) {
            if (nums[i] % 2 == 0) {
                i += 2;
            }
            else if (nums[j] % 2 != 0) {
                j += 2;
            }
            else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i += 2;
                j += 2;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{4,2,5,7})));
    }
}
