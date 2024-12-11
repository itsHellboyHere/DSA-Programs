package com.vishal.DataStruture.DP;

public class Uniqueways {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int ans=findWays(m,n);
        System.out.println(ans);
    }

    private static int findWays(int m, int n) {
        int ways=m+n-2;
        int sub=ways-(m-1);
        int ans = factorial(ways) / (factorial(m-1) *factorial(sub));

        return ans;
    }
    private static int factorial(int n){
        if(n==0) return 1;
        return n*factorial(n-1);
    }

}
