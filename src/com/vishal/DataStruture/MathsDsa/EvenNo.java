package com.vishal.DataStruture.MathsDsa;
//check prime no using bitwise operators.

//And of any number with 1 gives that no itself
// 0 AND 1==0 ,1 AND 1=1.
public class EvenNo {
    public static void main(String[] args) {
        boolean ans=checkEven(8);
        if(!ans){
            System.out.println("Even no.");
        }
        else {
            System.out.println("Odd no.");
        }
    }

    private static boolean checkEven(int n) {
        return (n & 1)==1;
    }
}
