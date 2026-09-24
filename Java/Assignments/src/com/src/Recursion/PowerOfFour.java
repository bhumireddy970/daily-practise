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
        while(n%4==0)
            n/=4;
        return n==1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(256));
        System.out.println(getPowerOfFour(4));
    }
}
