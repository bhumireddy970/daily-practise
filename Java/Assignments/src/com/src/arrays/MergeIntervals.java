package com.src.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if(intervals.length==0) return new int[0][];
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals,(a, b)->Integer.compare(a[0],b[0]));
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<=end)
                end=Math.max(end,intervals[i][1]);
            else{
                list.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }

        list.add(new int[]{start,end});

        return list.toArray(new int[0][]);

    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(merge(new int[][]{{1,3},{2,6},{8,10},{15,18}})));
    }
}
