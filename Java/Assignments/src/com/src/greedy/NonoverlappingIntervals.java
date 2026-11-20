package com.src.greedy;

import java.util.Arrays;

public class NonoverlappingIntervals {
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a, b)->(a[0]-b[0]));
        Arrays.sort(intervals,(a, b)->(a[1]-b[1]));

        int start=intervals[0][0];
        int end=intervals[0][1];
        int count=0;
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<end)
                count++;
            else{
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1, 100}, {11, 22}, {1, 11}, {2, 12}};
        System.out.println(eraseOverlapIntervals(intervals));
    }
}
