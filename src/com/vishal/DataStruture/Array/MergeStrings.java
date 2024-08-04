package com.vishal.DataStruture.Array;

import java.util.Arrays;

public class MergeStrings {
    public static void main(String[] args) {
        String str1="abc";
        String str2="pqr";
        String ans =merge(str1,str2);
        System.out.println("Merged alternatively => "+ans);
    }
    public static String merge(String word1, String word2){
        int i=0;
        int j=0;
        int k=0;
        char[] res= new char[word1.length() + word2.length()];
        while(i < word1.length() && j < word2.length()){
            res[k++]=word1.charAt(i++);
            res[k++]=word2.charAt(j++);
        }
        while(i<word1.length()){
            res[k++]=word1.charAt(i++);
        }
        while (j<word2.length()){
            res[k++]=word2.charAt(j++);
        }

        return new String(res);
    }
}
