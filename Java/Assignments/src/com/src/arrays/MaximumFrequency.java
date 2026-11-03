package com.src.arrays;

import java.util.HashMap;
import java.util.Map;

public class MaximumFrequency {
    public static int maxFreuency(int[] arr){
        if(arr==null || arr.length==0) return 0;
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num)>max)
                max = map.get(num);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxFreuency(new int[]{2, 3, 2, 5, 3, 2, 4, 3,3}));
    }
}
