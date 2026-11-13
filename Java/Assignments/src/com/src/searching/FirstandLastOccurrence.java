package com.src.searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstandLastOccurrence {
    public static int[] solution(int[] arr,int key)
    {
        List<Integer> list = new ArrayList<>();
        for(int num:arr)
            list.add(num);
        int first = list.indexOf(key);
        int last = list.lastIndexOf(key);

        return new int[] {first,last};
    }

    public static int firstOccurance(int[] nums, int target)
    {
        int first=-1;
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[mid]==target){
                first=mid;
                right=mid-1;
            }
            else if(nums[mid]<target)
                left=mid+1;

            else
                right=mid-1;
        }

        return first;
    }

    public static int lastOccurance(int[] nums, int target)
    {
        int last=-1;
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[mid]==target){
                last=mid;
                left=mid+1;
            }
            else if(nums[mid]<target)
                left=mid+1;

            else
                right=mid-1;
        }

        return last;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5,7,7,8,8,10},8)));

        int firstOccurance=firstOccurance(new int[]{5,7,7,8,8,10},8);
        int lastOccurance=lastOccurance(new int[]{5,7,7,8,8,10},8);
        System.out.println(firstOccurance);
        System.out.println(lastOccurance);
    }
}
