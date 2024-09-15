package com.vishal.DataStruture.Practice;

public class FindPeakElement {
    public static void main(String[] args) {
        int [] nums={1,2,1,3,5,6,4};
        int ans= findPeakElement(nums,0,nums.length-1);
        System.out.println("Peak element index => "+ans);
    }
    private static int findPeakElement(int[] nums,int s ,int e){
        if(s<e){
            int mid =(s+e)/2;
            if(nums[mid]>nums[mid+1]){
                return findPeakElement(nums,s,mid);
            }else{
                return findPeakElement(nums,mid+1,e);
            }
        }
        return e;
    }
}
