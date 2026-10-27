package com.src.math;

public class UglyNumber {
    public static boolean isUgly(int n) {
        if(n<=0) return false;
        while(n!=1)
        {
            if(n%2==0) n/=2;
            else if(n%3==0) n/=3;
            else if(n%5==0) n/=5;
            else return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(19));
    }
}
