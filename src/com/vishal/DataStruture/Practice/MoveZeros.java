package com.vishal.DataStruture.Practice;

import java.util.Arrays;
import java.util.HashMap;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);
    }
    private static void moveZeroes(int[] nums){
       int idx=0;

       for(int i=0;i<nums.length;i++){
           if(nums[i]!=0){
               nums[idx++] =nums[i];
           }

       }
       for(int i=idx;i<nums.length;i++){
           nums[i]=0;
       }
        System.out.println(Arrays.toString(nums));
    }
}
