package com.vishal.DataStruture.Array;
//Given an array of N integers, and an integer K,
// the task is to find the number of pairs of integers in the array whose sum is equal to K.
public class findSumequalsK {
    public static void main(String[] args) {
        int[] arr={1, 1, 1, 1};
        int K=2;
        int ans=findCount(arr,K);
        System.out.println("No of count is =>"+ans);
    }
    public static int findCount(int[] arr,int K){
        int s=0;
        int l=0;
        int count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>=K){
                l=i;
                while (K<sum && s <l){
                    sum-=arr[s];
                    s++;
                }
                if(sum==K){
                    count++;
                }
            }
        }
        return count;
    }
}
