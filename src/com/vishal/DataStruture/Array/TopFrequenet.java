package com.vishal.DataStruture.Array;
import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;

public class TopFrequenet {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3};
        int k=2;
        int[]res =topKFrequent(arr,k);
        System.out.println(Arrays.toString(res));
    }
    public static  int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> frequencyMap= new HashMap<>();
        for(int num:nums){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> queue= new PriorityQueue<>(
                (a,b) -> b.getValue() - a.getValue()
        );
        queue.addAll(frequencyMap.entrySet());
        int[] res= new int[k];
        int idx=0;
        for(int i=0;i<k;i++){
            res[idx++]=queue.poll().getKey();
        }
        return res;
    }
}
