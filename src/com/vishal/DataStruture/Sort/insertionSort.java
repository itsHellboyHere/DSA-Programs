package com.vishal.DataStruture.Sort;
//insertion sort is an in place sorting technique.
//time complexity=>0(n^2).
import java.util.Arrays;

 class Main {
    public static void main(String[] args) {
        int arr[]={2,1,1,34,67,3,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[ ] arr){
        for(int i=1;i<arr.length;i++){
            int v=arr[i];
            int j=i-1;
            while (j>=0 && arr[j] >v){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=v;
        }
    }
}
