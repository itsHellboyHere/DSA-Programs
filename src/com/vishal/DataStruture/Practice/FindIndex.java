package com.vishal.DataStruture.Practice;

import java.util.HashMap;
import java.util.HashSet;

public class FindIndex {
    public static void main(String[] args) {
        int[] arr={-10,-1,0,1,2,3,4,5,7};
        int ans=findIndex(arr);
        System.out.println(ans);
    }
    private static int findIndex(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        System.out.println(map);
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]) && map.get(arr[i])== arr[i]){
                return arr[i];
            }
        }
        System.out.println(map);
        return -1;
    }
}
