package com.xinshijie.leetcode;


public class MaximumSubarray {
//    public int maxSubArray(int[] nums) {
//        int max=0;
//        int total=0;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]>max){
//                max=nums[i];
//            }
//            if(total+nums[i]<0){
//                total=0;
//            }else {
//                total=total+nums[i];
//            }
//            if(total>max){
//                max=total;
//            }
//        }
//        return max;
//    }
    public int maxSubArray(int[] nums) {
        //注意负数,至少需要计算一次.所以不能是0
        int max=nums[0];
        int total=nums[0];
        for(int i=1;i<nums.length;i++){
            if(total+nums[i]>nums[i]){
               total=total+nums[i];
            }else{
               total=nums[i];
            }
            if(total>max){
                max=total;
            }

        }
        return max;
    }

    public static void main(String args[]){
        MaximumSubarray maximumSubarray=new MaximumSubarray();
        int[] nums0 = {5,4,-1,7,8};//23
        int[] nums1 = {-1,-5,5,4,-1,7,-8,-6,1,88};//
        int[] nums2 = {-1,-5,5,4,-1,7,-8,-6,-99,};
        int[] nums3 = {-1,-5,5,4,-1,7,-8,-34,1,5,88};
        int[] nums4 = {5,4,-1,7,-8,-34,1,5,88};
        int[] nums5 = {5,4,-1,7,-8,-34,1,5,-3,25};
        int[] nums6 = {5,4,-1,7,-8,-34,1,5,3,25};
        int[] nums7 = {-1,-5};
        int[] nums8 = {1};
        int[] nums9 = {-11,-5,-9};

        System.out.println(maximumSubarray.maxSubArray(nums0));
        System.out.println(maximumSubarray.maxSubArray(nums1));
        System.out.println(maximumSubarray.maxSubArray(nums2));
        System.out.println(maximumSubarray.maxSubArray(nums3));
        System.out.println(maximumSubarray.maxSubArray(nums4));
        System.out.println(maximumSubarray.maxSubArray(nums5));
        System.out.println(maximumSubarray.maxSubArray(nums6));
        System.out.println(maximumSubarray.maxSubArray(nums7));
        System.out.println(maximumSubarray.maxSubArray(nums8));
        System.out.println(maximumSubarray.maxSubArray(nums9));

    }
}
//10
//1 6    3  5
//9
//15