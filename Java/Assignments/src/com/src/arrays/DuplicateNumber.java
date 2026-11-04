package com.src.arrays;

public class DuplicateNumber {
    public static int duplicate(int[] nums) {
        if(nums.length==0)
            return 0;
        int slow=nums[0];
        int fast=nums[nums[0]];

        while(slow!=fast){
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        slow=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        System.out.println(duplicate(new int[]{1,3,4,2,2}));
    }
}
