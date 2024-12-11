package com.vishal.DataStruture.DP;

import com.vishal.oopsExamples.Scope.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinChange {
    static int[] dp;
    public static void main(String[] args) {
        int[] nums={1,2,5};
        int amount=11;
        dp=new int[amount+1];
        Arrays.fill(dp,-1);
//        int ans=findSum(nums,amount);
        int ans=findSum2(nums,amount,dp);
        System.out.println(ans);
    }
    static  int count=0;

    private static int findSum(int[] nums,  int amount) {
       int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int coin:nums){
            for (int j=coin;j<=amount;j++){
                dp[j] = Math.min(dp[j], dp[j - coin] + 1);
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
    private static int findSum2(int[] coins,int amount,int [] dp){
        if (amount==0) return 0;
        if(amount <0) return -1;
        if(dp[amount]!=-1){
            return dp[amount];
        }
        int min=Integer.MAX_VALUE;
        for( int coin:coins) {
            int result = findSum2(coins, amount-coin, dp);
            if (result != -1) {
                min = Math.min(min, result + 1);
            }
        }
        dp[amount]=(min==Integer.MAX_VALUE)?-1:min;
        return dp[amount];
    }


}
