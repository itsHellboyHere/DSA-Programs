package com.vishal.DataStruture.Backtracking;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidate={2,3,6,7};
        int target=7;
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        findComSum(candidate,0,target,ans,list,0);
        System.out.println(ans);
    }

    private static void findComSum(int[] candidate, int sum,int target, List<List<Integer>> ans, List<Integer> list,int idx) {
        if(sum == target){

            ans.add(new ArrayList<>(list));
            return;
        }
        if(sum > target){
            return;
        }
        for(int i=idx;i< candidate.length;i++){
            list.add(candidate[i]);
            findComSum(candidate,sum+candidate[i],target,ans,list,i);
            list.remove(list.size()-1);
        }
    }


}
