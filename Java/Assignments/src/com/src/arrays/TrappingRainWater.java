package com.src.arrays;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int l = 0, r = height.length - 1;
        int lm = 0, rm = 0, water = 0;

        while (l < r) {
            if (height[l] <= height[r]) {
                lm = Math.max(lm, height[l]);
                water += lm - height[l++];
            } else {
                rm = Math.max(rm, height[r]);
                water += rm - height[r--];
            }
        }
        return water;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
