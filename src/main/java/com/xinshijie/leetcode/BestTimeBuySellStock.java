package com.xinshijie.leetcode;

public class BestTimeBuySellStock {
    public int maxProfit(int[] prices) {
        //看题是只能交易一次,多次是2.
        int total=0;
        int max=0;
        int min=prices[0];
        //[7,2,5,3,1,6,4]
        for(int i=1;i<prices.length;i++){
           if(prices[i]>prices[i-1]){
                total=prices[i]-min;
                if(total>max){
                    max=total;
                }
           }else{
                if(prices[i] < min){
                    min=prices[i];
                }
           }
        }
        return max;
    }

    public static void main(String args[]){
        BestTimeBuySellStock bestTimeBuySellStock=new BestTimeBuySellStock();
        int[] nums = {7,1,2,5,3,6,4};
        int[] nums2 = {7,2,5,3,1,4,7,4};
        int[] nums3 = {7,1,5,3,6,4};
        int[] nums4 = {7};
        /**
         * {7,1,2,5,3,6,4};  1-6    1-5=4 3-6=3      =5
         * {7,1,2,5,3,7,4};  1-5 3-7 =    1-7=6
         * {7,1,2,5,3,8,4};  1-5 3-8
         */
        System.out.println(bestTimeBuySellStock.maxProfit(nums));
        System.out.println(bestTimeBuySellStock.maxProfit(nums2));
        System.out.println(bestTimeBuySellStock.maxProfit(nums3));
        System.out.println(bestTimeBuySellStock.maxProfit(nums4));
    }
}
