package com.src.sorting;

import java.util.Arrays;

public class MergeSortedArray {
    //using while loop
    public static void mergewhile(int[] nums1, int m, int[] nums2, int n) {
       int i=m-1;
       int j=n-1;
       int k=m+n-1;
       while(i>=0 && j>=0)
       {
           if(nums1[i]<nums2[j])
               nums1[k--]=nums2[j--];
           else
               nums1[k--]=nums1[i--];
       }
       while(j>=0)
           nums1[k--]=nums2[j--];

        System.out.println(Arrays.toString(nums1));
    }

    //using for loop
    public static void mergefor(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m+n-1,a=m-1,b=n-1;b>=0;i--)
        {
            if(a>=0 && nums1[a]>nums2[b])
                nums1[i]=nums1[a--];
            else
                nums1[i]=nums2[b--];
        }
        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;

        mergewhile(nums1, m, nums2, n);
        mergefor(nums1, m, nums2, n);
    }
}
