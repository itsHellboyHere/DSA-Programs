package com.vishal.DataStruture.Array;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums={2,3,1,2,4,3};
        int target=7;
        int ans=findMinimumSum(nums,target);
        System.out.println(ans);
    }
    public static int findMinimumSum(int[] nums,int target){
        int s =0;
        int e=0;
        int min_length=Integer.MAX_VALUE;
        int sum=0;
        while(e < nums.length){
            sum+=nums[e];
            while (sum >= target){
                min_length=Math.min(min_length,e-s+1);
                sum-=nums[s++];
            }
            e++;
        }
        return min_length !=Integer.MAX_VALUE ? min_length:0;
    }
}
