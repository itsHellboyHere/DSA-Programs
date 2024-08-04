package com.vishal.DataStruture.Array;

import com.vishal.oopsExamples.Scope.A;

import java.util.Arrays;

public class ProductSelf {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        findproduct(arr);
    }
    public static int[] findproduct(int[] arr){
        int[] prod=new int[arr.length];
        Arrays.fill(prod,1);
        System.out.println(Arrays.toString(prod));
        int curr=1;

        int[] p= new int[arr.length];
        Arrays.fill(p,1);
        for(int i=0;i<arr.length;i++){
            prod[i]*=curr;
            curr*=arr[i];
        }
        System.out.println("1st loop"+Arrays.toString(prod));
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                if(arr[i] ==arr[j]){
//                    continue;
//                }
//                p[i]*=arr[j];
//            }
//        }
        curr=1;
        for(int i=arr.length-1; i>=0;i--){
            prod[i]*=curr;
            curr*=arr[i];
        }
//        System.out.println(Arrays.toString(p));
        System.out.println(Arrays.toString(prod));
        System.out.println(curr);
        return prod;
    }
}
