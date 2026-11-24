package com.src.DP;

import java.util.Arrays;

public class BestTimeBuySellStockIv {
    public static int maxProfit(int k, int[] prices) {
        int n=prices.length;
        if(k>=n/2){
            int profit=0;
            for(int i=1;i<n;i++)
                profit+=Math.max(0,prices[i]-prices[i-1]);
            return profit;
        }

        int buy[]=new int[k+1],sell[]=new int[k+1];
        Arrays.fill(buy,Integer.MIN_VALUE);
        for(int profit : prices)
        {
            for(int j=1;j<=k;j++)
            {
                buy[j]=Math.max(buy[j],sell[j-1]-profit);
                sell[j]=Math.max(sell[j],buy[j]+profit);
            }
        }
        return sell[k];
    }

    public static void main(String[] args) {
        int k = 2;
        int[] prices = new int[]{2, 4, 1};
        System.out.println(maxProfit(k, prices));
    }
}
