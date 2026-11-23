package com.src.arrays;

public class BestTimeBuyandSellStockII {
    public static int maxProfit(int[] prices){
        boolean flag = false;
        int buy=0,sum=0;
        for(int i=0;i<prices.length-1;i++){
            if(!flag && prices[i]<prices[i+1]){
                buy=prices[i];
                flag=true;
            }else if(flag && prices[i]>prices[i+1]){
                sum+=prices[i]-buy;
                flag=false;
            }
        }
        if(flag)
            sum+=prices[prices.length-1]-buy;
        return sum;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
