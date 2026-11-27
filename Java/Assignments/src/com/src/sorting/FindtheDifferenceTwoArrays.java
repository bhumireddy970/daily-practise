package com.src.sorting;

import java.util.*;

public class FindtheDifferenceTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int num : nums1) set1.add(num);
        for(int num : nums2) set2.add(num);
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();

        for(int num : set1)
            if(!set2.contains(num))
                l1.add(num);
        for(int num : set2)
            if(!set1.contains(num))
                l2.add(num);
        return Arrays.asList(l1,l2);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{2, 4, 6};

        System.out.println(findDifference(nums1,nums2));

    }
}
