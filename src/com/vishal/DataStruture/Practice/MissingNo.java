package com.vishal.DataStruture.Practice;
import  java.util.*;
import java.util.ArrayList;

public class MissingNo {
    public static void main(String[] args) {
        int [] nums={9,6,4,2,3,5,7,0,1};
        int ans =findMissing(nums);
        System.out.println(ans);
    }
    private static int findMissing(int[] nums){
        int idx = 0;
        while (idx < nums.length){
            int cidx=nums[idx];
            if(nums[idx] <nums.length && nums[idx] != nums[cidx]){
                int temp = nums[idx];
                nums[idx]=nums[cidx];
                nums[cidx]=temp;
            }else{
                idx++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }


}
