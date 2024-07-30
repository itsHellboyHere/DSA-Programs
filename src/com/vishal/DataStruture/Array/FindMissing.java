package com.vishal.DataStruture.Array;
//Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers.
//
//        Note: There are no duplicates in the list.
public class FindMissing {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 5};
        int N = 5 ;
        int ans=findMissing(arr,N);
        int res=findMissingBySum(arr,N);
        System.out.println("Missing no is =>"+res);
//        System.out.println("Missing No is =>"+ans);
    }
    public static int findMissing(int[] arr, int N){
        int i=0;
        while (i <arr.length){
            int correctIdx=arr[i] -1;
            if(arr[i] >0 && arr[i] <=arr.length && arr[i] != arr[correctIdx]){
                swap(arr,i,correctIdx);
            }
            else {
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j] != j+1){
                return  j+1;
            }
        }
       return N;
    }

    public  static void swap(int[]arr,int i,int correctIdx){
        int temp=arr[i];
        arr[i] =arr[correctIdx];
        arr[correctIdx]=temp;
    }

    public static int findMissingBySum(int[] arr,int N){
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=N;i++){
            sum1+=i;
        }
        for(int j=0; j<arr.length;j++){
            sum2+=arr[j];
        }
        return  sum1 - sum2;
    }
}
