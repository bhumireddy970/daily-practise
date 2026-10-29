package com.src.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = -1;
            for (int j = 0; j < nums2.length ; j++) {
                 if (nums1[i] == nums2[j]) {
                     for (int k = j + 1; k < nums2.length; k++) {
                         if (nums2[k] > nums1[i]) {
                             res[i] = nums2[k];
                             break;
                         }
                     }
                     break;
                }
            }
        }
        return res;
    }
    public static int[] nextGreaterElement2(int[] nums1, int[] nums2){
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int num : nums2) {
            while(!stack.isEmpty() && stack.peek() <= num){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }

        while(!stack.isEmpty()){
            map.put(stack.pop(),-1);
        }
        int[] res = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            res[i] = map.get(nums1[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement2(new int[]{4, 1, 2}, new int[]{1, 2, 3, 4})));
    }
}
