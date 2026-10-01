package com.src.sorting;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
       Set<Integer> set = new HashSet<>();
       for(int num : nums) set.add(num);

       if(set.size()<3) return Collections.max(set);

       set.remove(Collections.max(set));
       set.remove(Collections.max(set));

       return Collections.max(set);
    }

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{3,2,1}));
    }
}
