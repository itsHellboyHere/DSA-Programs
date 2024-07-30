package com.vishal.DataStruture.MathsDsa;
//code for finding the unique no from a given array.
//we can also use hashmap
//we will use bit operator XOR
// a^a=0 ,a^0=a.
public class findUnique {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 1, 4,2};
        int ans = checkUnique(arr);
        System.out.println("unique no is : "+ans);
    }
    private static int checkUnique(int[] arr) {
        int unique = 0;
        for (int n : arr) {
            unique^=n;
        }
        return unique;
    }
}