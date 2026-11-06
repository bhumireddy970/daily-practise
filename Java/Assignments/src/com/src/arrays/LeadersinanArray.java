package com.src.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersinanArray {
    public static List<Integer> findLeaders(int[] arr){
        List<Integer> list=new ArrayList<>();
        int RightMax=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>RightMax)
            {
                list.add(arr[i]);
                RightMax=arr[i];
            }
        }
        Collections.reverse(list);
        return list ;
    }

    public static void main(String[] args) {
        System.out.println(findLeaders(new int[]{16 ,17 ,4 ,3 ,5 ,2}));
    }
}
