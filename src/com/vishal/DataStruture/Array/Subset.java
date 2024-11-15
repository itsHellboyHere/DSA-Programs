package com.vishal.DataStruture.Array;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr={1,6,5,11};
        List<Integer> ans= new ArrayList<>();
        findSubSet(arr,ans,0);
    }

    private static void findSubSet(int[] arr,List<Integer> list,int idx){
        if(idx== arr.length){
            System.out.println(list);
            return;
        }
        int val=arr[idx];
        list.add(val);
        findSubSet(arr,list,idx+1);
        list.remove(list.size()-1);
        findSubSet(arr,list,idx+1);
    }
}
