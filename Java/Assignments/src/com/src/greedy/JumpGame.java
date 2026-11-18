package com.src.greedy;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        int maxJump=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>maxJump) return false;
            maxJump=Math.max(maxJump,i+nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2,2,1,0,4}));
    }
}
