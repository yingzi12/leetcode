package com.xinshijie.leetcode;

import java.util.Arrays;

public class RotateArray {
    public static  void rotate(int[] nums, int k) {
        if(nums.length<k){
            k=k%nums.length;
        }
//        System.out.println(k);
        int[] startArray = Arrays.copyOfRange(nums, nums.length-k, nums.length);
        int[] endArray = Arrays.copyOfRange(nums, 0,nums.length-k );
//        System.out.println(Arrays.toString(startArray));
//        System.out.println(Arrays.toString(endArray));

        System.arraycopy(startArray, 0, nums, 0, startArray.length);
        // 将第二个数组复制到新数组，紧接着第一个数组之后
        System.arraycopy(endArray, 0, nums, startArray.length, endArray.length);
//        System.out.println(Arrays.toString(nums));

    }

    public static void main(String args[]){
        int[] nums = {345};
        rotate(nums,1);
    }
}
