package com.vishal.DataStruture.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutation {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> ans=permute(nums);
        System.out.println(ans);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        findPermute(nums,0,res,list);
        return res;
    }

    private static void findPermute(int[] nums,int idx, List<List<Integer>> res, List<Integer> list) {
        if(idx== nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<nums.length;i++){
            swap(nums,i,idx);
            list.add(nums[idx]);


            findPermute(nums,idx+1,res,list);
            list.remove(list.size()-1);
            swap(nums,i,idx);
        }
    }
    private static void swap(int[] nums,int i ,int j){
        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
