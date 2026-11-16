package com.src.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class LexicographicalSortedNumbers {
    public static List<Integer> lexicalOrder(int n) {
//        List<String> list = new ArrayList<>();
//        List<Integer> list1 = new ArrayList<>();
//
//        List<String> finalList = list;
//        IntStream.rangeClosed(1, n).forEach(i -> finalList.add(Integer.toString(i)));
//        list=list.stream().sorted().toList();
//        for(String s: list){
//            list1.add(Integer.parseInt(s));
//        }
//        return list1;
        List<Integer> list = new ArrayList<>();
        int curr=1;
        for(int i=0;i<n;i++){
            list.add(curr);
            if(curr*10<=n){
                curr*=10;
            } else {
                while(curr % 10 == 9 || curr + 1 > n) {
                    curr /= 10;
                }
                curr++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(lexicalOrder(14));

        System.out.println(isSubsetSum(new int[]{3, 34, 4, 12, 5, 2},9));
    }

    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        return sol(arr,sum,arr.length-1);
    }

    static boolean sol(int arr[], int target,int inx){
        if(target==0) return true;
        if(inx==0) return(arr[0]==target);

        boolean notTake=sol(arr,target,inx-1);
        boolean take=false;
        if(arr[inx]<=target)
            take=sol(arr,target-arr[inx],inx-1);

        return take||notTake;
    }
}
