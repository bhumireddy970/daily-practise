package com.src.bitwise;

public class XOROperationinArray {
    public static int xorOperation(int n, int start) {
        int[] arr=new int[n];
        int result=0;

        for(int i=0;i<n;i++) arr[i]=start+2*i;
        for(int num : arr) result^=num;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(xorOperation(4,3));
    }
}
