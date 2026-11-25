package com.src.Recursion;

public class PowerOfFour {
    public static int getPowerOfFour(int n) {
        if (n == 0)
            return 1;
        return 4*getPowerOfFour(n-1);
    }
    public static boolean isPowerOfFour(int n) {
        if(n<=0)
            return false;
        while(n%3==0)
            n/=3;
        return n==1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(82));
        System.out.println(getPowerOfFour(4));
    }
}
