package com.vishal.DataStruture.Practice;

public class FindMinimumInRotated {
    public static void main(String[] args) {
        int[] nums={6,5,4,1,2,3};
        int ans=findMinimum(nums,0,nums.length-1);
        System.out.println("Minimum element is =>"+ans);
    }
    private static int findMinimum(int[] nums,int s ,int e){
        int min=Integer.MAX_VALUE;
        if(nums[s] < nums[e]){
            return nums[s];
        }
        while( s<=e){
            int mid = (s+e)/2;
            if(nums[s] == nums[mid] && nums[e] == nums[mid]){
                min=Math.min(min,nums[mid]);
            }
            if(nums[mid] > nums[e]){
                s=mid+1;
            }else {
                min = Math.min(min, nums[mid]);
                e = mid - 1;
            }
        }
        return min;
    }
}
