package com.vishal.DataStruture.Array;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] ={3,4,76,3,21,1};
        reverseArray(arr,0,arr.length-1);
        for(int num : arr){
            System.out.println("Array is =>"+ num);
        }
    }
    public static void reverse (int [] arr){
        int s=0;
        int e=arr.length-1;
        while (s < e){
            swap(arr,s,e);
            s ++;
            e--;
        }
    }
    public  static  void swap(int [] arr , int start ,int end){
        int temp =arr[start];
        arr[start]=arr[end];
        arr[end] =temp;
    }
    //recursive way

    public static  void reverseArray(int [] arr , int start , int end){
        if(start >=end){
            return;
        }
        swap(arr,start ,end);
        reverseArray(arr,start+1,end-1);
    }
}
