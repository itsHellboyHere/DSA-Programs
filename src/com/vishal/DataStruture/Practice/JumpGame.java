package com.vishal.DataStruture.Practice;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums={3,2,1,0,4};
        boolean ans =jump(nums);
        System.out.println(ans);
    }
    private static boolean jump(int[] nums){
        int max=Integer.MIN_VALUE;
//        int i=0;
        int maxjump=nums[0];
        for(int i=0;i<nums.length;i++){
            if(i> maxjump){
                return false;
            }
            if(nums[i]+i>maxjump){
                maxjump=nums[i]+i;
            }
        }
        return true;
    }
}
