package com.src.Recursion;

public class FibonacciNumber {
    //Using Recursion
    public static int fib(int n) {
        if(n==0)
            return 0;
        if(n==1 )
            return 1;
        return fib(n-1)+fib(n-2);
    }
    //Usinf Loop
    public static int fibLoop(int n) {
        int first=0;
        int second=1;
        int result=0;
        for (int i=2;i<=n;i++) {
            result=first+second;
            first=second;
            second=result;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(fib(6));
        System.out.println(fibLoop(6));
    }
}
