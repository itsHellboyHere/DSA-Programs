package com.vishal.DataStruture.Recursion;
//Binary search using recursion
public class BinarySearch {
    public static void main(String[] args) {
            int arr[]={3,6,8,67,78,98};
            int target=98;
              int ans=binarysearch(target,arr,0,arr.length-1);
        System.out.println("Target index:"+ans);
    }
    static int binarysearch(int target,int[] arr,int start,int end){

        //base condtion
        if(start>end){ //start crosses the end means target was not found .
            return -1;
        }
        int mid=start+(end-start)/2;//finding the middle element.
        if(arr[mid]==target){
            return mid;//if target is the middle element it will return the middle index.
        }
        if(target<arr[mid]){
            return binarysearch(target,arr,start,mid-1);
        }
        return binarysearch(target,arr,mid+1,end);
    }
}
