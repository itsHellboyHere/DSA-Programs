package com.vishal.DataStruture.Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ProductExeptSelf {
    public static void main(String[] args) {
        int[] nums={-1,1,0,-3,3};
        int[] ans= new int[nums.length];
        ans=findProduct(nums);
        System.out.println(Arrays.toString(ans));
    }
    public  static int[]  findProduct(int[] nums){
        int[] pro=new int[nums.length];
        Arrays.fill(pro,1);
        for(int i=0;i<nums.length;i++){
            int left=findProductLeft(nums,i);
            int right=findProductRight(nums,i);
            nums[i]*=left*right;
        }
        return pro;
    }

    int idx=0;
    private static  int findProductLeft(int[] nums,int idx){
        int pro=1;
        for(int i=idx-1; i>=0;i--){
            pro*=nums[i];
        }
        return pro;
    }
    private static int findProductRight(int[] nums,int idx){
        int pro=1;
        for(int i=idx+1;i<nums.length;i++){
            pro*=nums[i];
        }
        return pro;
    }
}
