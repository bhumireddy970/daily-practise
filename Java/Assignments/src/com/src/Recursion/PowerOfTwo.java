package com.src.Recursion;

public class PowerOfTwo {
    public static int getPowerOfTwo(int n) {
        if(n==0)
            return 1;
        return 2*getPowerOfTwo(n-1);
    }
    public static boolean isPowerOfTwo(int n) {
//        for(int i=0;i<=n/2;i++)
//        {
//            if(n==getPowerOfTwo(i)) {
//                return true;
//            }
//        }
//        return false;
        return n>0 && ((n&(n-1))==0);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1024));
    }
}
