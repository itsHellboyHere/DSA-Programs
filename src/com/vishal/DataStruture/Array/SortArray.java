package com.vishal.DataStruture.Array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr={5,4,2,3};
        int n = arr.length-1;
        sort(arr,n);
        System.out.println("Sorted Array is "+Arrays.toString(arr));
    }
    public static void sort(int[]arr,int n){
        int min;
        for(int i=0;i<arr.length-1;i++){

            for(int j=i+1 ;j<arr.length;j++){
                if(arr[j] < arr[i]){

                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

}
