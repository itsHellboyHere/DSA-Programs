package com.vishal.DataStruture.Array;

import com.vishal.oopsExamples.Scope.A;

import java.util.ArrayList;
import java.util.List;

public class subSets {
    public static void main(String[] args) {
        int[] nums={1,2};
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> sol=new ArrayList<>();
        findSubsets(nums,0,res,sol);
        System.out.print("Subsets => "+ res);
    }

    private static void findSubsets(int[] nums, int i, List<List<Integer>> res, List<Integer> sol) {
        if(i==nums.length){
            res.add(new ArrayList<>(sol));
            return;
        }
        System.out.println("Index value "+i);
        findSubsets(nums,i+1,res,sol);
        System.out.println("Index : "+i);
        sol.add(nums[i]);

        findSubsets(nums,i+1,res,sol);
        sol.remove(sol.size()-1);
    }
}
