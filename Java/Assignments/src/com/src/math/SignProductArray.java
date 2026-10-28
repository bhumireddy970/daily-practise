package com.src.math;

public class SignProductArray {
    public static int arraySign(int[] nums) {
        int sign=0;
        for(int n: nums)
        {
            if(n==0)
                return 0;
            else if(n<0)
                sign-=1;
        }

        return sign%2==0?1:-1;
    }

    public static void main(String[] args) {
        System.out.println(arraySign(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
}
