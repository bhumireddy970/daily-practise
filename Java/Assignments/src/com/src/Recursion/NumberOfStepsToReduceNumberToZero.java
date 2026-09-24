package com.src.Recursion;

public class NumberOfStepsToReduceNumberToZero {
    public static int numberOfSteps(int num) {
        if(num==0)
            return 0;
        if(num==1 )
            return 1;
        if(num%2==0)
            return numberOfSteps(num/2)+1;
        else
            return numberOfSteps(num-1)+1;
    }
    public static void main(String[] args) {
        System.out.println(numberOfSteps(12));
    }
}
