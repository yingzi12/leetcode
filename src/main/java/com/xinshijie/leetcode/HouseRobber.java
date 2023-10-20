package com.xinshijie.leetcode;


//假设6个数字,最大结果的组合方式有
// 1	3	    5
// 1	3			6
// 1		4		6
//    2     4       6
//    2         5
//和
// 1	3(3+1)	    5(5+3+1) 5取和最高就是5的值
// 1	3(3+1)		    6(6+3+1)
// 1		4(4+1)		6(6+4+1) 6取和最高的就是6的值
//    2     4(4+2)      6(6+4+2)
//    2             5(5+2)
public class HouseRobber {
    public int rob(int[] nums) {
        int max=0;
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return nums[0]>nums[1]? nums[0]:nums[1];
        }
        if(nums.length==3){
            return (nums[0]+nums[2])>nums[1]? nums[0]+nums[2]:nums[1];
        }
        nums[2]=nums[0]+nums[2];
        max=nums[2]>nums[1]? nums[2]:nums[1];
        for(int i=3;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-2] > nums[i]+nums[i-3] ? nums[i]+nums[i-2] : nums[i]+nums[i-3];
            if(max<nums[i]){
                max=nums[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        HouseRobber bestTimeBuySellStock=new HouseRobber();
        int[] nums = {10,1,10,2,10,6};//135
        int[] nums2 = {6,10,4,10,2,10};//246
        int[] nums3 = {10,2,10,1,1,10};//136
        int[] nums4 = {10, 2, 1, 10, 6, 10};//146
        int[] nums5 = {1, 10, 2, 1, 10, 2};//25
        int[] nums6 = {10};//25
        int[] nums7 = {1, 10};//25
        int[] nums8 = {1,3,1};//25
        System.out.println(bestTimeBuySellStock.rob(nums));
        System.out.println(bestTimeBuySellStock.rob(nums2));
        System.out.println(bestTimeBuySellStock.rob(nums3));
        System.out.println(bestTimeBuySellStock.rob(nums4));
        System.out.println(bestTimeBuySellStock.rob(nums5));
        System.out.println(bestTimeBuySellStock.rob(nums6));
        System.out.println(bestTimeBuySellStock.rob(nums7));
        System.out.println(bestTimeBuySellStock.rob(nums8));

    }
}
