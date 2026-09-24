package com.src.Recursion;

public class Factorial {
    public static int getFactorial(int num) {
        if(num==1) return 1;
        return num * getFactorial(num-1);
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(4));
    }
}
