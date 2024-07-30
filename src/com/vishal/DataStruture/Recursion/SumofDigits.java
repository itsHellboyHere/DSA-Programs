package com.vishal.DataStruture.Recursion;

public class SumofDigits {
    public static void main(String[] args) {
        int n=1234;
        int ans=sumofdigits(n);
        System.out.println(ans);
    }

    private static int sumofdigits(int n) {
        if(n==0){
            return 0;
        }
        return n%10 +sumofdigits(n/10);

    }
}
