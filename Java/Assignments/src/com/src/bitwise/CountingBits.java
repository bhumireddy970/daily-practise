package com.src.bitwise;

import java.util.Arrays;

public class CountingBits {
    public static int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            if((n&1)==1){
                count++;
            }
            n>>=1;
        }
        return count;
    }
    //method 1 Normal loop
    public static int[] countBits(int n) {
        int[] res=new int[n+1];
        for(int i=0;i<=n;i++){
            res[i]=hammingWeight(i);
        }
        return res;
    }

    //method 2 Dynamic Programming
    public static int[] countBitsDP(int n) {
        int[] res=new int[n+1];
        for(int i=0;i<=n;i++){
            res[i]=res[i>>1]+(i&1);
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(10)));
        System.out.println(Arrays.toString(countBitsDP(10)));
    }
}
