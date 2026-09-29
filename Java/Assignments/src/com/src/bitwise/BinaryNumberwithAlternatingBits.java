package com.src.bitwise;

public class BinaryNumberwithAlternatingBits {
    public static boolean hasAlternatingBits(int n) {
        int x=n^(n>>1);
        return(x&(x+1))==0;
    }

    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(12));
    }
}
