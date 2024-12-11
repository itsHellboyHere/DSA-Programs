package com.vishal.DataStruture.Backtracking;

import java.util.*;

public class letterCombination {
    public static void main(String[] args) {
        String s="23";
//        List<List<String>> ans= new ArrayList<>();
        List<String> list= new ArrayList<>();
        StringBuilder  sb = new StringBuilder();
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
//


        findComb(s,sb,0,list,map);
        System.out.println(list);
    }


    private static void findComb(String s,StringBuilder sb, int idx,List<String> list, HashMap<Character,String> map) {
        if(list.size()==s.length() || idx==s.length()){
            list.add(sb.toString()); 
            return;
        }
        String chars=map.get(s.charAt(idx));
        for(int i=0;i<chars.length();i++){
            char c= chars.charAt(i);
            sb.append(c);
            findComb(s,sb,idx+1,list,map);
            sb.deleteCharAt(sb.length()-1);
        }
    }


}
