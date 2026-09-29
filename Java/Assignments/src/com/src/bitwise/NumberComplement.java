package com.src.bitwise;

public class NumberComplement {
    public static int findComplement(int num) {
        if(num==0 || num ==1) return num^1;
        int count=Integer.toBinaryString(num).length();
        int mask=(1<<count)-1;
        return num^mask;
    }

    public static void main(String[] args) {
        System.out.println(findComplement(2));
    }
}
