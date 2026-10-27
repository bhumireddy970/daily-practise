package com.src.math;

public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        int l=num%10;
        if(num==0 || num==1 || num==4) return true;
        if(l==2 || l==3 || l==7 || l==8) return false;
        for(int i=2;i*i<=num;i++)
        {
            if(num==i*i) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(9));
    }
}
