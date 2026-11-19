package com.src.greedy;

import java.util.Arrays;

public class MaximumMatchingPlayersTrainers {
    public static int matchPlayersAndTrainers(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0,n1=g.length,n2=s.length;
        while(i<n1 && j<n2)
            if(s[j++] >= g[i]) i++;
        return i;
    }

    public static void main(String[] args) {
        int[] players = new int[]{4, 7, 9};
        int[] trainers = new int[]{8, 2, 5, 8};
        System.out.println(matchPlayersAndTrainers(players, trainers));
    }
}
