package com.vishal.DataStruture.Array;

import java.util.ArrayList;
import java.util.Arrays;

//Given an array of integers, find the length of the longest
// sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
public class LongestConsectuiveSeq {
    public static void main(String[] args) {
        int[] arr={1,2,0,1};
        int ans=lcSequence(arr,arr.length);
        System.out.println("Longest-length is => "+ans);
    }
    public static int lcSequence(int[] arr,int n){
        Arrays.sort(arr);
        int count=0;
        int ans=0;
        ArrayList<Integer> res= new ArrayList<>();

        for(int i=1;i<n;i++){
            if(arr[i] !=arr[i-1]) {
                res.add(arr[i]);
            }
        }
        for(int i=0;i<n;i++){

            if(i>0 && arr[i] == arr[i-1]+1){
                count++;
            }else{
                count=1;
            }
            ans=Math.max(count,ans);
        }
        return ans;
    }
}
