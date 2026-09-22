package com.src.Recursion;

public class PrintingNnumbers {
    public static void printNnumbers(int n){
        if(n==0)
            return;

        printNnumbers(n-1);
        System.out.print(n+",");
    }
    public static void main(String[] args) {
        printNnumbers(5);
        System.out.println();
        printNnumbers(10);
        System.out.println();
    }
}
