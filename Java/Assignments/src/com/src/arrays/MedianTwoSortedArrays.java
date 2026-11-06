package com.src.arrays;

public class MedianTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        int i=0,j=0,m1=0,m2=0;

        for(int count=0;count<=(m+n)/2;count++)
        {
            m2=m1;
            if(i!=m && j!=n)
            {
                if(nums1[i]>nums2[j])
                    m1=nums2[j++];
                else
                    m1=nums1[i++];
            }else if(i<m)
                m1=nums1[i++];
            else
                m1=nums2[j++];
        }

        if((n+m)%2==1)
            return m1;
        else
            return ((double) m1+(double) m2)/2.0;
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,3},new int[]{2,4,5}));
    }
}
