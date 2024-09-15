package com.vishal.DataStruture.Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums={3,2,3};
        int ans= findMajority(nums);
        System.out.println(ans);
    }
    private static int findMajority(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int count=map.get(nums[i]);
                if(count > nums.length/2){
                    return nums[i];

                }
            }
        }
        return -1;
    }
}
