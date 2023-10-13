package com.xinshijie.leetcode;

import java.util.HashMap;

public class TowSum {
    public static int[] twoSum(int[] nums, int target) {
        //数字数
        int[] number={0,0};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int difference = target-nums[i];
            if(map.containsKey(difference)){
                number[0]=map.get(difference);
                number[1]=i;
                return number;
            }

            map.put( nums[i],i);
        }
        return number;

    }
    public static void main(String[] args) {
        int[] nums ={0,0,12,-6,-1,-5,2,2,3,3,4,4,5,6,7,43,56,343,345,345,345};
        int[] number=twoSum(nums,-7);
        System.out.println(number[0]+" "+number[1]);
    }
}
