package com.src.math;

public class GCD_LCM {
    public static int findGCD(int a, int b){
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    public static int findLCM(int a, int b){
        return (a*b)/findGCD(a,b);
    }

    public static void main(String[] args) {
        System.out.println(findGCD(24,12));
        System.out.println(findLCM(24,12));
    }
}
