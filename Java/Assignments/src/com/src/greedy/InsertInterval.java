package com.src.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length,i=0;
        List<int[]> list=new ArrayList<>();
        while(i<n && intervals[i][1]<newInterval[0])
            list.add(intervals[i++]);
        while(i<n && intervals[i][0]<=newInterval[1])
        {
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        list.add(newInterval);
        while(i<n)
            list.add(intervals[i++]);
        return list.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1, 3}, {6, 9}};
        int[] newInterval = new int[]{2, 5};
        System.out.println(Arrays.deepToString(insert(intervals,newInterval)));
    }
}
