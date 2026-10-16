package com.src.string;

public class LatestTimeYouCanObtain {
    public static String findLatestTime(String s) {
        char[] arr = s.toCharArray();
        if(arr[0]=='?')
            arr[0]=(arr[1]=='?' || arr[1]<2)?'1':'0';
        if(arr[1]=='?')
            arr[1]=arr[0]=='1'?'1':'9';
        if(arr[3]=='?')
            arr[3]='5';
        if(arr[4]=='?')
            arr[4]='9';

        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        System.out.println(findLatestTime("0?:5? "));
    }
}
