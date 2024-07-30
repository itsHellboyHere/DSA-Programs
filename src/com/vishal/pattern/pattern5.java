package com.vishal.pattern;
//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1
public class pattern5 {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n){
        for(int r=1 ;r<=n ;r++ ){
            for(int col =1 ; col<=r ;col ++){
                if( (r + col) % 2 == 0){
                    System.out.print(1 +" ");
                }else{
                    System.out.print(0+" ");
                }

            }
            System.out.println();
        }
    }
}
