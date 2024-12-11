package com.vishal.DataStruture.DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums={10,9,2,5,3,7,101,18};
        int[][] dp=new int[nums.length+1][nums.length];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
//        int ans=findLIS(nums,-1,0,dp);
        int ans=findLIS2(nums);
        System.out.println(ans);
    }

    private static int findLIS(int[] nums,int prev,int curr,int[][] dp) {
        if(curr==nums.length){
            return 0;
        }
        if(dp[prev+1][curr]!=-1){
            return dp[prev+1][curr];
        }
        int include=0;
        if(prev==-1 || nums[curr]>nums[prev]){
            include=1+findLIS(nums,curr,curr+1,dp);
        }
        int exclude=findLIS(nums,prev,curr+1,dp);
        return dp[prev+1][curr]=Math.max(include,exclude);
    }
    private static int findLIS2(int[]nums){
        List<Integer> ans= new ArrayList<>();
        ans.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                ans.add(nums[i]);
            }else{
                int small=bsearch(ans,0,ans.size()-1,nums[i]);
            }
        }
        return ans.size();
    }
    private static int bsearch(List<Integer>list, int start,int end,int num){
        while (start<=end){
            int mid=start+(end-start)/2;
            if(list.get(mid)>=end){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return start;
    }
}
