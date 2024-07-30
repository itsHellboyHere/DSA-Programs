package com.vishal.DataStruture.Recursion;

public class skipString {
    public static void main(String[] args) {
        System.out.println("String is : "+skipstring("bccappdfga","apple"));
    }
    public static String skipstring(String str,String skip){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("app") && !str.startsWith(skip)){
            return skipstring(str.substring(3),skip);
        }
        else {
            return str.charAt(0)+skipstring(str.substring(1),skip);
        }
    }
}
