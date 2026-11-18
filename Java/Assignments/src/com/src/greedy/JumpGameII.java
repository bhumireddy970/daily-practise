package com.src.greedy;

public class JumpGameII {
    public static int jump(int[] nums) {
        int n=nums.length;
        int jumps=0,l=0,r=0;

        while(r<n-1)
        {
            int farthest=0;
            for(int i=l;i<=r;i++){
                farthest=Math.max(i+nums[i],farthest);
            }
            l=r+1;
            r=farthest;
            jumps++;
        }
        return jumps;
    }

    public static void main(String[] args) {
        System.out.println(jump(new int[]{2,3,1,1,4}));
    }
}
