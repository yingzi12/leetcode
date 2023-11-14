package com.xinshijie.leetcode;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
    //使用Set判断是否存在就好了
    public boolean containsDuplicate(int[] nums) {
      Set<Integer> number=new HashSet<>();
      for(int i=0;i<nums.length;i++){
          if(number.contains(nums[i])){
              return true;
          }else {
              number.add(nums[i]);
          }
      }
      return false;
    }
}
