package com.vishal.DataStruture.Recursion;

public class MaxValue {
    public static void main(String[] args) {
        int arr[]={2,3,7,1,8,2,10,5};
        int ans=max_value(arr,1,3);
        System.out.println(ans);
    }
    public static int max_value(int arr[],int s ,int e){
        int max=0;
        for(int i=s;i<=e;i++){
            if(arr[s]>arr[e]){
                max=arr[s];
                e--;
            }
            else{
                max=arr[e];
                s++;
            }
        }
        return max;
    }


}
