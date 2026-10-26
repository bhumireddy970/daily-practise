package com.src.math;

public class Squareroot {
    public static int mySqrt1(int x) {
        if(x<=1) return x;

        int s=1;
        int e=x/2;
        int res=0;

        while(s<=e)
        {
            int m=s+(e-s)/2;
            if(m==x/m)
                return m;
            else if(m<x/m)
            {
                res=m;
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return res;
    }

    public static int mySqrt2(int x) {
        if(x<2) return x;
        long r=x;
        while(r*r>x)
            r=(r+x/r)/2;
        return (int)r;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt1(10));
        System.out.println(mySqrt2(10));
    }
}
