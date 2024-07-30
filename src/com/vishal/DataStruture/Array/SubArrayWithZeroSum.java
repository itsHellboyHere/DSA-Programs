package com.vishal.DataStruture.Array;

import java.util.HashSet;

//Given an array of positive and negative numbers,
// the task is to find if there is a subarray (of size at least one) with 0 sum.
public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        int arr[]={4,2,-3,1,6};
        boolean ans=subArraywithZeroSum(arr);
        if(ans){
            System.out.println("Zero sum found");
        }else{
            System.out.println("No zero sum found");
        }
    }
    public static Boolean subArraywithZeroSum(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        int prefixsum=0;
        for(int num:arr){
            prefixsum+=num;
            if(prefixsum == 0 || set.contains(prefixsum)){
                return true;
            }
            set.add(prefixsum);
        }
        return false;
    }

}
