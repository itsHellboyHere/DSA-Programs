package com.vishal.DataStruture.Array;

import java.util.Arrays;

//Program to cyclically rotate an array by one
public class CyclicRotate {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] arr){
        int last_var=arr[arr.length-1];
        for(int i =arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last_var;
    }

}
