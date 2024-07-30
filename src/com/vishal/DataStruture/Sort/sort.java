package com.vishal.DataStruture.Sort;

public class sort {
    public  void merge(int[]arr,int l,int mid,int h){
            int[]ans=new int[h-l+1];
            int i=l,j=mid+1,k=0;
            while(i<=mid && j<=h){
                if(arr[i]<=arr[j]){
                    ans[k++]=arr[i++];
                }else{
                    ans[k++]=arr[j++];
                }
            }
            while(i<=mid){
                ans[k++]=arr[i++];
            }
            while(j<=h){
                ans[k++]=arr[j++];
            }
        for( i=l;i<=h;i+=1){
            arr[i]=ans[i-l];
        }
    }

    public void mergeSort(int []arr,int l,int h){
        if(l<h){
            int mid = (l+h)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,h);
            merge(arr,l,mid,h);
        }

    }
    public void printdetails(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println("Array is :"+ arr[i]);
        }
    }
    public static void main(String[] args) {
            int arr[]={2,1,2,1};
            sort obj =new sort();
            obj.mergeSort(arr,0,arr.length-1);
            obj.printdetails(arr);
    }
}
