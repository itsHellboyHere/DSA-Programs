package com.vishal.DataStruture.Recursion;

import java.util.ArrayList;

public class subSeq {
    public static void main(String[] args) {
            subsequence("","abc");

        System.out.println( subseq("","abc"));
    }
    public static void subsequence(String p,String u){
        if(u.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=u.charAt(0);
        subsequence(p+ch,u.substring(1));
        subsequence(p,u.substring(1));
    }
    public static ArrayList<String> subseq(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subseq(p+ch,up.substring(1));
        ArrayList<String> right=subseq(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
