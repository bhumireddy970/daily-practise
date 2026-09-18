package com.src;

import java.util.Stack;

public class RobotReturnOrigin {
    public static boolean judgeCircle(String moves) {
        int upDown=0,leftRight=0;
        for(char c : moves.toCharArray())
        {
            if(c=='U')
                upDown++;
            else if(c=='D')
                upDown--;
            else if(c=='L')
                leftRight++;
            else
                leftRight--;
        }

        return upDown==0 && leftRight==0;
    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("DURDLDRRLL"));
    }
}
