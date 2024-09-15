package com.vishal.DataStruture.Practice;

import java.util.HashSet;

public class LongestSubString {
    //Without repeating character.
    public static void main(String[] args) {
        String s="bbbbbacbc";
        int ans=findLongestSubstring(s);
        System.out.println(ans);
    }
    //use sliding-window and set for duplicates.
    private static int findLongestSubstring(String s){
        int max=Integer.MIN_VALUE;
        HashSet<Character> set = new HashSet<>();
        int r=0,l=0;
        while(r<s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                //Window-size is variable.
                max=Math.max(max,r-l+1);
                r++;
            }else{
                set.remove(s.charAt(r));
                l++;
            }
        }
        return max;
    }
}
