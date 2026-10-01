package com.src.sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class IntersectionofTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> intersect=new HashSet<>();

        for(int num : nums1)
            set.add(num);

        for(int num : nums2)
        {
            if(set.contains(num))
                intersect.add(num);
        }

        int[] res=new int[intersect.size()];
        int k=0;
        for(int num : intersect)
            res[k++]=num;

        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1,2,2,1}, new int[]{2,2})));
    }
}
