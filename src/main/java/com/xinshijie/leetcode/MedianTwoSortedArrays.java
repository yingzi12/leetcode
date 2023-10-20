package com.xinshijie.leetcode;

public class MedianTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int s1Length=nums1.length;
        int s2Length=nums2.length;
        //这个可以优化掉,
        int num[]=new int[s1Length+s2Length];
       // 优化掉之后,如果s0的值是s1Length+s2Length的一半,根据情况来取s1的或s2的值或者订都取1个
        int s0=0;
        int s1=0;
        int s2=0;
        boolean ok=true;
        if(s1Length ==0 || s2Length ==0){
            ok=false;
        }
        while(ok){
            if(nums1[s1]>nums2[s2]){
                num[s0]=nums2[s2];
                s2++;
                s0++;
            }else {
                num[s0]=nums1[s1];
                s1++;
                s0++;
            }
            if(s1==s1Length || s2==s2Length){
                ok=false;
            }
        }
        for(int i=s1;i<s1Length;i++){
            num[s0]=nums1[i];
            s0++;
        }
        for(int i=s2;i<s2Length;i++){
            num[s0]=nums2[i];
            s0++;
        }
        int z=(s1Length+s2Length)/2;
        double total=0.0;
        if((s1Length+s2Length)%2==0){
            total=(num[z]+num[z-1])/2.0;

        }else{
            total=num[z]/1.0;
        }
        return total;
    }

    public static void main(String args[]){
        MedianTwoSortedArrays maximumSubarray=new MedianTwoSortedArrays();
        int[] nums0 = {5,7,8};//23
        int[] nums1 = {-1,-5,5};//
        int[] nums2 = {};
        int[] nums3 = {3};
        int[] nums4 = {5,4,-1,7,-8,-34,1,5,88};
        int[] nums5 = {5,4,-1,7,-8,-34,1,5,-3,25};
        int[] nums6 = {5,4,-1,7,-8,-34,1,5,3,25};
        int[] nums7 = {-1,-5};
        int[] nums8 = {1};

//        System.out.println(maximumSubarray.findMedianSortedArrays(nums0,nums1));
        System.out.println(maximumSubarray.findMedianSortedArrays(nums2,nums3));

    }
}
