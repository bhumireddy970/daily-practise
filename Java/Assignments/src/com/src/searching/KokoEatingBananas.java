package com.src.searching;

public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;

        for(int pile : piles)
            high=Math.max(high,pile);
        while(low<high)
        {
            int mid=low+(high-low)/2;

            long hours=0;
            for(int pile : piles)
                hours+=(pile+(long)mid-1)/mid;

            if(hours<=h)
                high=mid;
            else
                low=mid+1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] piles = new int[]{30, 11, 23, 4, 20};
        int h = 6;
        System.out.println(minEatingSpeed(piles, h));
    }

}
