package com.xinshijie.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleNumber {
    public static  int[] rotate(int[] nums) {
        //因为重复的肯定成对出现，题目1题目3一个list就可以，长度也可以固定
        List<Integer> arrSigle=new ArrayList<>();
        List<Integer> arrTwo=new ArrayList();

        for(int i=0;i<nums.length;i++){
            if(arrSigle.contains(Integer.valueOf(nums[i]))){
                arrSigle.remove(Integer.valueOf(nums[i]));
                arrTwo.add(nums[i]);
            }else{
                if(!arrTwo.contains(Integer.valueOf(nums[i]))){
                    arrSigle.add(nums[i]);
                }
            }
        }
        int value[]=new int[2];
        value[0]=arrSigle.get(0);
        value[1]=arrSigle.get(1);
        return value;
    }

    public static void main(String args[]){
        int[] nums = {4,4,3,4,5,5};
        System.out.println(rotate(nums));
    }
}
