package com.vishal.DataStruture.Array;

import java.util.ArrayList;

//Given an array of n elements that contains elements from 0 to n-1,
// with any of these numbers appearing any number of times. Find these repeating numbers in O(n) and use only constant memory space.
public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr={1,1,2};
        int n=1;
        ArrayList<Integer> ans= findDuplicates(arr,n);
        System.out.println(ans);
    }

    public static ArrayList<Integer> findDuplicates(int[] arr,int n){
        ArrayList<Integer> res= new ArrayList<>();
        int i=0;
        while (i <arr.length){
            int c_idx=arr[i]-1;
            if(arr[i] >0 && arr[i] <=arr.length && arr[i] != arr[c_idx]){
                int temp = arr[i];
                arr[i] =arr[c_idx];
                arr[c_idx]=temp;
            }
            else {
//                res.add(arr[i]);
                i++;

            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j] != j+1){
                res.add(arr[j]);

            }
        }
//        res.add(n);
        return res;
    }
}
