package com.src.greedy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Minimumplatformsrequiredrailwaystation {
    public static int minPlatform(int arr[], int dep[]){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0,j=0,n=arr.length;
        int count=0,max=0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                i++;
                count++;
            }
            else{
                j++;
                count--;
            }
            max=Math.max(max,count);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2225, 1729, 1835, 951, 1143, 515, 1525, 743, 1025, 1611, 1827, 2203, 1116, 1514, 723};
        int[] dep=  {2231, 2003, 2149, 2252, 2352, 2153, 1625, 1049, 1337, 1639, 2151, 2330, 1633, 1611, 2009};

        System.out.println(minPlatform(arr,dep));
    }
}
