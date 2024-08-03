package com.vishal.DataStruture.Array;

import com.vishal.oopsExamples.Scope.Main;

public class LCS {
    public static void main(String[] args) {
        String X="ABC";
        String Y="ACD";
        longestcommonSubsequence(X,Y);
    }
    public static int longestcommonSubsequence(String X, String Y){
        int m=X.length();
        int n=Y.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(X.charAt(i-1) == Y.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    System.out.println("Match found " + dp[i][j]);
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    System.out.println("Match not found " + dp[i][j]);
                }
            }
        }
        return dp[m][n];
    }
}
