package com.src.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class FindNumbersDisappearedArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] arr=new boolean[nums.length+1];

        List<Integer> list=new ArrayList<>();
        for(int n :nums)
            arr[n]=true;
        for(int i=1;i<arr.length;i++)
        {
            if(!arr[i])
                list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
