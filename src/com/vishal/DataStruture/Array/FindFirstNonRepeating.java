package com.vishal.DataStruture.Array;

import java.util.Arrays;
import java.util.HashMap;

//Given an array of integers of size N,
// the task is to find the first non-repeating element in this array.
public class FindFirstNonRepeating {
    public static void main(String[] args) {
        int[] arr={9, 4, 9, 6, 7, 4};
        int ans=findNonRepeating(arr);
        System.out.println("First-non repeating character is =>"+ans);
    }
    public static int findNonRepeating(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]) && map.get(arr[i])== 1){
                return arr[i];
            }

        }
        return -1;
    }

}
