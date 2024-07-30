package com.vishal.DataStruture.Array;

public class FindOccurances {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,2,3};
        int x=2;
        int ans=countOccurance(arr,arr.length,x);
        System.out.println("Total occurance of " +x+" => "+ans);
    }
    public  static int firstOccurance(int [] arr, int l , int h , int x){
        if(h>=l){
            int mid =(l+h)/2;
            if(mid== 0 || x >arr[mid-1] && x== arr[mid]){
                return mid;
            }
            else if(x > arr[mid]){
                return  firstOccurance(arr ,mid+1 , h,x);
            }
            else {
                return firstOccurance(arr,l,mid-1,x);
            }
        }
        return  -1;
    }

    public static int lastOccurance(int[] arr , int n , int l,int h ,int x){
        if(h>=l){
            int mid = (l+h)/2;
            if(mid==n-1 || x <arr[mid+1] && x==arr[mid]){
                return mid;
            }
            else if(x < arr[mid]){
                return lastOccurance(arr,n,l,mid-1,x);
            }
            else {
                return  lastOccurance(arr,n,mid+1,h,x);
            }
        }
        return -1;
    }

    public static int countOccurance(int[] arr , int n , int x){
        int firstOccur=firstOccurance(arr,0,n-1,x);
//        System.out.println("first"+firstOccur);
        if(firstOccur ==-1){
            return -1;
        }
        int lastOccur=lastOccurance(arr,n,firstOccur,n-1,x);
//        System.out.println("Last "+lastOccur);

        return  (lastOccur - firstOccur) + 1;
    }
}
