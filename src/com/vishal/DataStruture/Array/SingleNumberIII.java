package com.vishal.DataStruture.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SingleNumberIII {
//    Given an integer array nums,
//    in which exactly two elements appear only once and all the other elements appear exactly twice.
//    Find the two elements that appear only once. You can return the answer in any order.
public static void main(String[] args) {
    int[] arr={1,2,1,3,2,5};
    int[] ans=singleNoIII(arr);
    System.out.println(Arrays.toString(ans));
}
public static int[] singleNoIII(int[] nums){
    HashMap<Integer,Integer> map= new HashMap<>();
    for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
        }
        else{
            map.put(nums[i],1);
        }
    }
//    ArrayList<Integer> res=new ArrayList<>();
    int[] res= new int[2];
    int idx=0;
    for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i]) && map.get(nums[i]) == 1){
            res[idx]=nums[i];
            idx++;
            if(idx==2){
                break;
            }
        }
    }
    return res;
}
}

