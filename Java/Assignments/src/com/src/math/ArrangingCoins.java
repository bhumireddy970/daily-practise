package com.src.math;

public class ArrangingCoins {
    public static int arrangeCoins(int n) {
        if(n==0)
            return 0;
        if(n==1 || n==2)
            return 1;
        int count=0;
        for(int j=1;j<=n;j++){
            if(j<=n) {
                count++;
                n = n - j;
            }
            else
                break;

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
}
