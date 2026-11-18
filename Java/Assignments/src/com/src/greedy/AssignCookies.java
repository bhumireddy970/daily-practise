package com.src.greedy;

import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0,n1=g.length,n2=s.length;
        while(i<n1 && j<n2)
            if(s[j++] >= g[i]) i++;
        return i;
    }

    public static void main(String[] args) {
        int[] g = new int[]{1, 2, 3};
        int[] s = new int[]{1, 1};
        System.out.println(findContentChildren(g,s));
    }
}
