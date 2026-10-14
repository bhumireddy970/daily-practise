package com.src.string;

public class ValidNumber {
    public static boolean isNumber(String s) {
        if(s.length() == 0) return false;
        if(s.matches("[+-]?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?")) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(isNumber("."));
    }
}
