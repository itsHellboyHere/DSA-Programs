package com.vishal.DataStruture.Recursion;

public class Pattern1 {
    public static void main(String[] args) {
            triangle(4,0);
            System.out.println();
            traingle2(4,0);
    }
    static void triangle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            triangle(r,c+1);
            System.out.print("*");
        }
        else {
            triangle(r-1,0);
            System.out.println();
        }
    }
    static void traingle2(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            traingle2(r,c+1);
        }else{
            System.out.println();
            traingle2(r-1,0);
        }
    }
}
