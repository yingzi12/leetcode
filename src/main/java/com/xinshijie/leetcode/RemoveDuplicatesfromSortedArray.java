package com.xinshijie.leetcode;


public class RemoveDuplicatesfromSortedArray {

    public static int removeDuplicates(int[] nums) {
        //数字数
        int count=1;
        int next=1;
        int length=nums.length;
        //当前的数字
        int now=nums[0];
        for(int i=1;i<length;i++){
            if(now != nums[i]){
                nums[next]=nums[i];
                next++;
                count=count+1;
            }
            now=nums[i];
        }
        return count;

    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4,4,5,6,7,43,56,343,345,345,345};
        System.out.println(removeDuplicates(nums));
    }
}
