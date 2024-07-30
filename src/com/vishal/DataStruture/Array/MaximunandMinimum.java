package com.vishal.DataStruture.Array;

 class MaximumandMinimum {
     public static void main(String[] args) {
         int arr[] ={2,6,1,65,100,42,300,100};
         int ans=maximum(arr);
         System.out.println("Maximum element  is "+ ans);
     }
     public  static  int maximum(int[]arr){
         int start =0;
         int end=arr.length-1;
         while(start < end){
             if(arr[start] < arr[end]){
                 start++;
             }else{
                 end--;
             }

         }
         return  arr[start];
     }
}
