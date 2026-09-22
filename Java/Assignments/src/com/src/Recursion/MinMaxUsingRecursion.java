package com.src.Recursion;

import java.util.ArrayList;
import java.util.List;

public class MinMaxUsingRecursion {
    public static List<Integer> findMinMax(int[] arr, int length) {
        if(length==0)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(arr[0]);
            temp.add(arr[0]);
            return temp;
        }

        List<Integer> result=findMinMax(arr,length-1);
        if(arr[length]< result.get(0)) result.set(0, arr[length]);

        if(arr[length]> result.get(1)) result.set(1, arr[length]);

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};

        List<Integer> res = findMinMax(arr,arr.length-1);

        System.out.println(res.get(0) + " " + res.get(1));
    }
}
