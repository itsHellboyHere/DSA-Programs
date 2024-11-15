package com.vishal.DataStruture.Practice;

import com.vishal.oopsExamples.Scope.A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class zigzagMatrix {
    public static void main(String[] args) {
        String s="PAYPALISHIRING";
        printZigZag(s,3);
//    PAHNAPLSIIGYIR
    }

    private static void printZigZag(String s,int rows) {
        char [][] arr= new char[rows][rows+(rows-1)];
        char[] s2=s.toCharArray();
        int row_start=0;
        int row_end=arr.length-1;
        int col_start=0;
        int col_end= arr[0].length-1;
        int index=0;


        // top-to-bottom

        int count=1;
        HashMap<Integer,List<Character>> map=new HashMap<>();
        for(int i=1;i<=rows;i++){
            map.put(i,new ArrayList<>());

        }
        boolean isBottom=true;
        while(index <s.length()){
             map.get(count).add(s.charAt(index));
             index++;
             if(isBottom){
                 //top-to-down
                 if(count <rows){
                     count ++;
                 }
                 else{
                     isBottom=false;
                     count--;
                 }
             }else {
                 // bottom-up
                 if(count >1){
                     count --;
                 }else{
                     isBottom=true;
                     count ++;
                 }
             }
        }
        System.out.println(map);
        StringBuilder res=new StringBuilder();
        for(int i=1;i<=rows;i++){
            for(char c:map.get(i)){
                res.append(c);
            }
        }
        res.toString();
        System.out.println("Output is => "+res);
//        for(char[] r:arr){
//            for(char n:r){
//                System.out.print(n);
//            }
//            System.out.println();
//        }

    }
}
