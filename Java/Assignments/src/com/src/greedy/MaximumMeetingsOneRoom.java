package com.src.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumMeetingsOneRoom {
    public static ArrayList<Integer> maxMeetings(int[] s, int[] f){
        int n = s.length;
        int[][] time = new int[n][3];
        for(int i=0;i<n;i++){
            time[i][0] = s[i];
            time[i][1] = f[i];
            time[i][2] = i+1;
        }
        Arrays.sort(time,(a,b)->a[1]-b[1]);

        ArrayList<Integer> ans = new ArrayList<>();
        int maxTime=-1;
        for(int i=0;i<n;i++){
            int st=time[i][0];
            int fi =time[i][1];

            if(st>maxTime){
                maxTime=fi;
                ans.add(time[i][2]);
            }
        }
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        int s[]={1, 3, 0, 5, 8, 5};
        int f[]={2, 4, 6, 7, 9, 9};

        System.out.println(maxMeetings(s,f));
    }
}
