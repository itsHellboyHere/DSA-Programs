package com.vishal.DataStruture.Array;

import java.util.HashMap;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr ={0,1,2,0,1,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i< arr.length;i++){
           if(map.containsKey(arr[i])){
               map.put(arr[i],map.get(arr[i])+1);
           }
           else {
               map.put(arr[i],1);
           }
        }
//        for(int keys:map.keySet() ){
//            System.out.println("value at " +keys +" is "+ map.get(keys));
//        }
        int [] res= new int[arr.length];
        int index=0;
        for (int i = 0; i <= 2; i++) {  
            if (map.containsKey(i)) {
                int count = map.get(i);
                for (int j = 0; j < count; j++) {
                    res[index++] = i;
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
//        System.out.println(res.length);
    }

}
