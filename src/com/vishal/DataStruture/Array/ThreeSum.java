package com.vishal.DataStruture.Array;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        List<List<Integer>> ans=findSumEqualZero(arr);
        System.out.println("The values => "+ans);
    }

    private static List<List<Integer>> findSumEqualZero(int[] arr) {
        Set<List<Integer>> res= new HashSet<>();
        for(int i=0;i< arr.length-2;i++){
            Set<Integer> seen= new HashSet<>();
            for(int j=i+1;j< arr.length;j++){
                int sum=arr[i]+arr[j];
                int complement=-sum;
                if(seen.contains(complement)){
                    List<Integer> list=Arrays.asList(arr[i],arr[j],complement);
                    list.sort(Integer::compareTo);
                    res.add(list);
                }
                seen.add(arr[j]);
            }
        }

        return new ArrayList<>(res);
    }
}
