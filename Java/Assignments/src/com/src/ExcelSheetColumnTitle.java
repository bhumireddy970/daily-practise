package com.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ExcelSheetColumnTitle {

    public static String convertToTitle(int columnNumber) {
        List<Character> list =new ArrayList<>(List.of('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'));
        int rem=columnNumber-1;
        String s="";
        Stack<Character> stack=new Stack<>();
        while (rem>0){
            stack.push(list.get((rem%26)));
            rem=rem/26;
        }
        while (!stack.isEmpty()){
            s+=stack.pop();
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(convertToTitle(1));
    }
}
