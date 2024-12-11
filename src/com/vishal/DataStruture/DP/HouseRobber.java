package com.vishal.DataStruture.DP;

import java.util.Arrays;

public class HouseRobber {
    static int[]dp;
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        dp=new int[arr.length+1];
        Arrays.fill(dp,-1);
        int ans= findMax(arr,arr.length-1);
        System.out.println(ans);
    }

    private static int findMax(int[] arr ,int idx) {
        if(idx<0){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        dp[idx]= Math.max(

                findMax(arr,idx-2)+arr[idx],
                findMax(arr,idx-1)
        );
        return  dp[idx];
    }
}
