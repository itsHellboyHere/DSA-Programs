package com.vishal.DataStruture.Array;
//Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing,
// find the maximum element in the array.
public class peakElement {
    public static void main(String[] args) {
        int arr[] ={16,7,5,4,3,2};
        int n = arr.length;
        int ans=peakelement(0,n-1,arr,n);
        System.out.println("Index of peak element is => "+ans);
    }
    public static  int peakelement(int s , int e , int[] arr , int n){

        int mid = s+(e-s) /2;

        if((mid == 0 || arr[mid-1] <=arr[mid]) && (mid == n-1 || arr[mid] >= arr[mid+1])){
            return  mid;
        }
        else if( mid > 0 && arr[mid -1] > arr[mid]){
            return  peakelement(s,mid-1,arr,n);
        }
        else {
            return  peakelement(mid+1,e,arr,n);
        }
    }
}
