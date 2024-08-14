package com.vishal.DataStruture.Practice;

public class MaximumProduct {
    public static void main(String[] args) {
        int[] nums ={2, 3, -2, 8};
        int ans=findMaximumProduct(nums);
        System.out.println("Maximum Sub-Array Product is =>" +ans);
    }
    private static int findMaximumProduct(int[] nums){
        int max_pro=nums[0];
        int max_curr=nums[0];
        int min_curr=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=max_curr;
                max_curr=min_curr;
                min_curr=temp;
            }
            max_curr=Math.max(max_curr * nums[i] ,nums[i]);
            min_curr=Math.min(min_curr * nums[i],nums[i]);
            if(max_curr >max_pro){
                max_pro=max_curr;
            }
        }
        return max_pro;

    }

}
