package com.vishal.DataStruture.Array;

import java.util.HashMap;

//Find the length of largest subarray with 0 sum
public class LengthOflargestsubzero {
    public static void main(String[] args) {
        int[] arr ={5,2,-1,1,4};
        int ans=findLengthofLargestSubArraySumZero(arr);
        System.out.println("Largest sub-array with zero sum is=> "+ans);
    }
    public static int findLengthofLargestSubArraySumZero(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int max_length=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum == 0){
                max_length=i+1;
            }
            else{
                if(map.containsKey(sum)){
                    max_length=Math.max(max_length,i-map.get(sum));
                }
                else{
                    map.put(sum,i);
                }
            }
        }
        return max_length;
    }
}
