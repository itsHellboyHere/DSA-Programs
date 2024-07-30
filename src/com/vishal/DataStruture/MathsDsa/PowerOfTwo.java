package com.vishal.DataStruture.MathsDsa;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n=8;
        boolean ans=(n & (n-1)) ==0;

        if(ans){
            System.out.println("Power of 2.");
        }
        else {
            System.out.println("Not a power of 2.");
        }

    }
}
