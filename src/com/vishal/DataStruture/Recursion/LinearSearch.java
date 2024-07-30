package com.vishal.DataStruture.Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={2,6,8,4,4,10};
//        boolean ans=find(arr,4,0);
//        System.out.println(ans);
//        System.out.println("Index is :"+findIndex(arr,4,0));
//        System.out.println("Index is :"+findIndexLast(arr,4,arr.length-1));
        ArrayList<Integer> list=new ArrayList<>();
        findAllindex(arr,4,0,list);
        System.out.println(list);
    }

    static boolean find(int[] arr,int target,int idx){
        if(idx==arr.length){
            return false;
        }
        return arr[idx]==target||find(arr,target,idx+1);
    }
    static  int findIndex(int[] arr,int target,int idx){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==target){
            return idx;
        }
        return findIndex(arr,target,idx+1);
    }
    static int findIndexLast(int[] arr,int target,int idx){
        if(idx==-1){
            return  -1;
        }
        if(arr[idx]==target){
            return idx;
        }
        return findIndexLast(arr,target,idx-1);
    }

    static ArrayList<Integer> findAllindex(int[] arr, int target, int idx , ArrayList<Integer> list){
        if(idx==arr.length){
            return list;
        }
        if(arr[idx]==target){
            list.add(idx);
        }
        return findAllindex(arr,target,idx+1,list);
    }
}
