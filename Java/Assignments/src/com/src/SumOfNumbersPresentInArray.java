package com.src;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfNumbersPresentInArray {

    public static int isSumPresentInArray(int[] arr)
    {

        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int sum=arr[i]+arr[j];
                for(int k=0;k<arr.length;k++)
                {
                    if(sum==arr[k])
                    {
                        count++;
                    }
                }

            }

        }

        return count;
    }
    public static int isSumPresentInArray2(int[] arr){
        Set<Integer> list=new HashSet<>();

        for(int num:arr)
            list.add(num);
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
                if(list.contains(arr[i]+arr[j]))
                    count++;
        }
        return count;
    }

    public static int isSumPresentInArray3(int[] arr){
        Set<Integer> list= Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toSet());
        return (int)IntStream.range(0,arr.length)
                .flatMap(i->IntStream.range(i+1,arr.length).map(j->arr[i]+arr[j]))
                .filter(list::contains)
                .count();
    }

    public static void main(String[] args) {
        int[] arr={1,5,3,2,8,7};

        System.out.println(isSumPresentInArray3(arr));
    }
}
