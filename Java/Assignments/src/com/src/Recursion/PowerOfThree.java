package com.src.Recursion;

public class PowerOfThree {
    public static int getPowerOfThree(int n) {
        if (n == 0)
            return 1;
        return 3*getPowerOfThree(n-1);
    }
    public static boolean isPowerOfThree(int n) {
        if(n<=0)
            return false;
        while(n%3==0)
            n/=3;
        return n==1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(81));
        System.out.println(getPowerOfThree(2));
    }
}
