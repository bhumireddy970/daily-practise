package com.src.math;

public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;


        int result = 0;

        long di = Math.abs((long) dividend);
        long ds = Math.abs((long) divisor);
        while (di >= ds) {
            result += 1;
            di -= ds;
        }

        if ((dividend < 0) ^ (divisor < 0)) {
            result = -result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(divide(111,2));
    }
}
