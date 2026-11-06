package com.src.arrays;

import java.util.Arrays;

public class GreatestElementonRightSide {
    public static int[] replaceElements(int[] arr) {
        int RightMax=-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>RightMax)
            {
                int temp=arr[i];
                arr[i]=RightMax;
                RightMax=temp;
            }else
                arr[i]=RightMax;

        }
        return arr ;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[]{17,18,5,4,6,1})));
    }
}
