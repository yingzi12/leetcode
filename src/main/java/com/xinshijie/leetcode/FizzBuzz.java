package com.xinshijie.leetcode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FizzBuzz {
    public  int climbStairs(int n) {

        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int[] total=new int[n+1];
        total[1]=1;
        total[2]=1;

        //key是和 value是数量  表示每个数字的统计数
        Map<Integer,Integer> mapTotal=new HashMap<>();
        mapTotal.put(1,1);
        mapTotal.put(2,1);
        //这里的I表示长度
        for(int i=2;i<n;i++){
            Map<Integer,Integer> map=new HashMap<>();
            mapTotal.forEach((key, value) -> {
                if(map.containsKey(key+1)){
                    Integer count=map.get(key+1);
                    map.put(key+1,count+value);
                }else{
                    map.put(key+1,value);
                }
                if(map.containsKey(key+2)){
                    Integer count=map.get(key+2);
                    map.put(key+2,count+value);
                }else{
                    map.put(key+2,value);
                }
            });
            map.forEach((key, value) -> {
                if(key<=n) {
                    total[key] = total[key] + value;
                }
            });
            mapTotal=map;

        }
        return total[n]+1;
    }

//    public  int climbStairs2(int n) {
//        int total=0;
//        total=total+ difference(n,1);
//        total=total+ difference(n,2);
//        return total;
//    }
//
//    public  Integer difference(int n,int step){
//        int total=0;
//        int difference=n-step;
//        if(difference<0){
//            return 0;
//        }
//        if( difference==0 || difference==1){
//            return 1;
//        }else {
//            total=total+difference(difference,1);
//            total=total+difference(difference,2);
//        }
//        return total;
//    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz=new FizzBuzz();
//        System.out.println(fizzBuzz.climbStairs(25)+"  "+fizzBuzz.climbStairs2(25));
        System.out.println(fizzBuzz.climbStairs(25));

    }
}
