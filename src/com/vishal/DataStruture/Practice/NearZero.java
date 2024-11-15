package com.vishal.DataStruture.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NearZero {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,7};
       List<String> ans = findRange(arr);
        System.out.println(ans);
    }
public static  List<String> findRange(int[] nums){
//        String s="";
        List<String> ans= new ArrayList<>();
        for(int i=0;i< nums.length;i++){
            int start=nums[i];
            while(i< nums.length-1 && nums[i]+1==nums[i+1]){
                i++;
            }
            if(nums[i]!=start){
                ans.add(""+start+"->"+nums[i]);
            }
            else{
                ans.add(""+start);
            }
        }
        return ans;
}

}
