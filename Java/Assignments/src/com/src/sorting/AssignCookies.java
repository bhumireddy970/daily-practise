package com.src.sorting;

import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        if(s.length==0) return 0;

        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int cookeIndex=s.length-1;
        int childIndex=g.length-1;

        while(cookeIndex>=0&&childIndex>=0){
            if(s[cookeIndex]>=g[childIndex]){
                count++;
                childIndex--;
                cookeIndex--;
            }else {
                childIndex--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] g={1,2,3};
        int[] s={1,2,3};
        System.out.println(findContentChildren(g,s));
    }
}
