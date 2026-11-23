package com.src.DP;

import java.util.*;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n : nums)
            map.put(n,map.getOrDefault(n,0)+1);
        List<Integer> list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a, b)->map.get(b)-map.get(a));

        int[] arr=new int[k];
        for(int i=0;i<k;i++)
            arr[i]=list.get(i);
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums,k)));
    }
}
