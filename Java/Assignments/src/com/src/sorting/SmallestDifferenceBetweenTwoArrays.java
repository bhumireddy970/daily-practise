package com.src.sorting;

import java.util.Arrays;

public class SmallestDifferenceBetweenTwoArrays {
    public static void smallestDifference(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0,min=Integer.MAX_VALUE,x=0,y=0;
        while(i<a.length && j<b.length){
            int diff=Math.abs(a[i]-b[j]);
            if(diff<min){
                min=diff;
                x=a[i];
                y=b[j];
            }
            if(a[i]<b[j]) i++;
            else j++;
        }
        System.out.println(x+" "+y);
        System.out.println(min);
    }

    public static void main(String[] args) {
        int[] a = new int[]{-1,5,10,20};
        int[] b = new int[]{26 ,134 ,135 ,15};
        smallestDifference(a,b);
    }
}

