package com.xinshijie.leetcode;

public class BestTimeBuySellStockII {

    public int maxProfit(int[] prices) {
        int total=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                total=total+(prices[i]-prices[i-1]);
            }
        }
        return total;
    }

    public static void main(String args[]){
        BestTimeBuySellStockII bestTimeBuySellStock=new BestTimeBuySellStockII();
        int[] nums = {7,1,2,5,3,6,4};
        int[] nums2 = {1,2,5,3,7,9};
        int[] nums3 = {7,1,2,5,3,8,4};
        int[] nums4 = {7};
        int[] nums5 = {1,3};
        /**
         * {7,1,2,5,3,6,4};  1-6    1-5=4 3-6=3      =5
         * {7,1,2,5,3,7,4};  1-5 3-7 =    1-7=6
         * {7,1,2,5,3,8,4};  1-5 3-8
         */
        System.out.println(bestTimeBuySellStock.maxProfit(nums));
        System.out.println(bestTimeBuySellStock.maxProfit(nums2));
        System.out.println(bestTimeBuySellStock.maxProfit(nums3));
        System.out.println(bestTimeBuySellStock.maxProfit(nums4));
        System.out.println(bestTimeBuySellStock.maxProfit(nums5));
    }
}
