package com.vishal.DataStruture.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

//Given an array of integers, find the length of the longest
// sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
public class LongestConsectuiveSeq {
    public static void main(String[] args) {
        int[] arr={100,4,200,1,3,2,};
        int ans=lcSequence(arr,arr.length);
        System.out.println("Longest-length is => "+ans);
    }
    public static int lcSequence(int[] arr,int n){
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i]-1)){
                int currentNum=arr[i];
                int currentLen=1;
                while(set.contains(currentNum + 1)){
                    currentNum=currentNum+1;
                    currentLen+=1;
                }
                count=Math.max(count,currentLen);
            }

        }
        return count;
    }
}
