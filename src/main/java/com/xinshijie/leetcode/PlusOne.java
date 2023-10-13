package com.xinshijie.leetcode;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        if(digits[length-1]!=9){
            digits[length-1]=  digits[length-1]+1;
            return digits;
        }else{
            if(length ==1){
                int[] number={1,0};
                return number;
            }else{
                //是否需要加1
                boolean ok=true;
                for(int i=length-1;i>=0;i--){
                    if(ok) {
                        int sum = digits[i] + 1;
                        if (sum > 9) {
                            digits[i] = 0;
                            if(i==0){
                                int[] number=new int[length+1];
                                number[0]=1;
                                return number;
                            }
                        }else{
                            digits[i]=sum;
                            ok=false;
                        }
                    }else{
                        return  digits;
                    }
                }
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] nums ={9,9,9};
        int[] number=plusOne(nums);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]);
        }
    }
}
