package com.src.DP;

import java.util.Arrays;

public class CompareVersionNumbers {
    public static int compareVersion(String version1, String version2) {
        String[] str1=version1.split("\\.");
        String[] str2=version2.split("\\.");
        int n1=str1.length,n2=str2.length;
        int i=0;
        while(i<n1&&i<n2) {
            if(Integer.parseInt(str1[i])>Integer.parseInt(str2[i])) return 1;
            else if(Integer.parseInt(str1[i])<Integer.parseInt(str2[i])) return -1;
            i++;
        }
        while(i<n1)
            if(Integer.parseInt(str1[i++])!=0) return 1;
        while(i<n2)
            if(Integer.parseInt(str2[i++])!=0) return -1;
        return 0;
    }

    public static void main(String[] args) {
        String version1 = "1.0";
        String version2 = "1.0.0.0";
        System.out.println(compareVersion(version1, version2));
    }
}
