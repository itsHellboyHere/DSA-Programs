package com.vishal.DataStruture.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n=2;
        String s="()";
        StringBuilder sb= new StringBuilder();
        List<String> ans= new ArrayList<>();
        generate(n,s,sb,0,0,ans);
        System.out.println(ans);
    }

    private static void generate(int n, String s, StringBuilder sb, int open,int close, List<String> ans) {
        if(close==n){
            ans.add(sb.toString());
            return;
        }
        if(open <n){
            sb.append('(');
            generate(n,s,sb,open+1,close,ans);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(')');
            generate(n,s,sb,open,close+1,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
