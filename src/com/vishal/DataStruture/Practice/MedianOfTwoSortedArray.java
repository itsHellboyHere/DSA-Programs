package com.vishal.DataStruture.Practice;

import java.util.Arrays;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1={1,2};
        int[] nums2={3,4};
        double ans=findMedian(nums1,nums2);
        System.out.println(ans);
    }
    private static double findMedian(int[] nums1, int[] nums2){
        int[] result=merge(nums1,nums2);
        int n= result.length;
        if(n%2==0){
            return (double) (result[(n-1)/2]+result[n/2])/2.0;
        }
        return (double) result[n/2];
    } 
    private static int[] merge(int[]nums1,int[] nums2){
        int[] result= new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<= nums2[j]){
                result[k++]=nums1[i++];
            }else{
                result[k++]=nums2[j++];
            }
        }
        while (i <nums1.length){
            result[k++]=nums1[i++];
        }
        while (j<nums2.length){
            result[k++]=nums2[j++];
        }
//        System.out.println(Arrays.toString(result));
        return result;
    }
}
