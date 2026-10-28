package com.src.math;

public class Power {
    public static double myPow(double x, int n) {
        long N = Math.abs((long) n);
        double sum = 1;

        for (; N > 0; N /= 2, x *= x) {
            if (N % 2 == 1) {
                sum *= x;
            }
        }
        return n < 0 ? 1 / sum : sum;

    }

    public static void main(String[] args) {
        System.out.println(myPow(2, 10));
    }
}
