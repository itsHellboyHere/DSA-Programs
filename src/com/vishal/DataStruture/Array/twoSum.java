package com.vishal.DataStruture.Array;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int[] arr={2,3,11,15};
        int target=5;
        int[]ans=find2Sum(arr,target);
        System.out.print("Ans => "+ Arrays.toString(ans));
    }

    private static int[] find2Sum(int[] arr, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }else{
                map.put(arr[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
