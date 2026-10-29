package com.src.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pattern132 {
    public static boolean find132pattern(int[] nums) {
        for(int i=0;i<nums.length-2;i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(nums[i] < nums[k] && nums[k]  < nums[j])
                        return true;
                }
            }
        }
        return false;
    }
    public static boolean find132pattern2(int[] nums) {
        if(nums==null||nums.length<3)
            return false;

        int ak=Integer.MIN_VALUE;
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<ak) return true;

            while (!stack.isEmpty() && stack.peek()<nums[i])
                ak=stack.pop();

            stack.push(nums[i]);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums= {3,1,4,2};
        System.out.println(find132pattern(nums));
        System.out.println(find132pattern2(nums));
    }
}
