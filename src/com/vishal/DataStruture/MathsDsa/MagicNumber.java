package com.vishal.DataStruture.MathsDsa;

public class MagicNumber {
    public static void main(String[] args) {
        int n=6;

        int ans=0;
        int base=5;
        while(n>0){
            int last=n&1;
            n=n>>1;
            ans+=base*last;
            base=base*5;
        }
        System.out.println("Magic no is :"+ans);
    }
}
