package com.src.DP;

import java.util.Arrays;
import java.util.Collections;

public class MaxofNonSubseqArray {
    public static int max(int[] arr){
        Integer[] temp=new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i+2;j<arr.length;j++){
                if((arr[i]+arr[j])>max){
                    max=arr[i]+arr[j];
                }
            }
            temp[i]=max;
        }
        Arrays.sort(temp, Collections.reverseOrder() );
        return temp[0];
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,9,11,22};
        System.out.println(max(arr));
    }
}
