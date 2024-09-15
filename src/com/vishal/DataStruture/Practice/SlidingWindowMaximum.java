package com.vishal.DataStruture.Practice;
import java.util.*;
import java.util.ArrayList;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        findMaximum(nums,k);
    }
    private static ArrayList<Integer> findMaximum(int[] nums,int k){
        ArrayList<Integer>  list = new ArrayList<>();
        int l=0;
        int max=Integer.MIN_VALUE;
        for(int i =0;i<k;i++){
            max=Math.max(nums[i],max);
            list.add(max);
        }
        for(int r=k;r< nums.length;r++){
            int cmax=Integer.MIN_VALUE;

        }
        System.out.println(list);
        return  list;
    }
}
