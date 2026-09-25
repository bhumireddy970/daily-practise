package com.src.Recursion;

public record SumOfDigitOfNumber() {
    public static int getSum(int num){
        if(num==0) return 0;
        return num%10 + getSum(num/10);
    }

    public static void main(String[] args) {
        System.out.println(getSum(-1));
    }
}
