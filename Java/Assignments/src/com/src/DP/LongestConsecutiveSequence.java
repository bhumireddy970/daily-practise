package com.src.DP;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int n : nums)
            set.add(n);
        int lon=0;
        for(int n : set){
            if(!set.contains(n-1))
            {
                int curr=n;
                int count=1;
                while(set.contains(curr+1))
                {
                    curr++;
                    count++;
                }
                lon=Math.max(lon,count);
            }
        }
        return lon;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(longestConsecutive(nums));
    }
}
