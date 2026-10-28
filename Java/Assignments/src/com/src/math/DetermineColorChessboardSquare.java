package com.src.math;

public class DetermineColorChessboardSquare {
    public static boolean squareIsWhite(String coordinates) {

        int sum=coordinates.charAt(0)-'0'+coordinates.charAt(1);

        if(sum%2!=0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(squareIsWhite("h3"));
    }
}
