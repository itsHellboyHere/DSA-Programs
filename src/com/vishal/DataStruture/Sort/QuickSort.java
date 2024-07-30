package com.vishal.DataStruture.Sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr={6,4,5,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int [] arr,int low ,int high){
        if(low>=high){
            return;
        }
        int s=low;
        int e=high;
        int p=arr[high];

        while(s<=e){
            System.out.println("loop runs!");
            while(arr[s]<p){
                s++;
            }
            while (arr[e]>p){
                e--;
            }
            if (s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        sort(arr,low,e);
        sort(arr,s,high);
    }
}
