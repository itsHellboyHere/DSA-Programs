package com.vishal.DataStruture.Array;

import java.util.Arrays;
import java.util.Map;

public class MinimumPlatforms {
    public static void main(String[] args) {
        int [] arr1={900, 940, 950, 1100, 1500, 1800};
        int [] arr2={910, 1200, 1120, 1130, 1900, 2000};
        int ans=findMinimumPlatform(arr1,arr2);
        System.out.println(ans);
    }

    public static int findMinimumPlatform(int[] arr,int[] dep){
        Arrays.sort(arr);
        Arrays.sort(dep);

        int s=0;
        int e=0;
        int platform =0,result=0;
        int n=arr.length;
        while(s <n && e<n ){
            if(arr[s] <= dep[e]){
                platform+=1;
                s++;
            }else{
               platform-=1;
               e++;
            }
            result= Math.max(platform,result);
        }
        return result;
    }
}
