package com.vishal.pattern;


//        ____*____
//        ___***___
//        __*****__
//        _*******_
//        *********
//        _*******_
//        __*****__
//        ___***___
//        ____*____
public class pattern8 {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        for(int r = 1; r<=n ;r++){
            for(int s=1 ; s<=(2 *(n-r))/2 ; s++){
                System.out.print(" ");
            }
            for(int col=2;col<=r;col++){
                System.out.print("*");
            }
            for(int col=1;col<=r;col++){
                System.out.print("*");
            }
            for(int s=1 ; s<=(2 *(n-r))/2 ; s++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int r = n-1; r>=1 ;r--){
            for(int s=1 ; s<=(2 *(n-r))/2 ; s++){
                System.out.print(" ");
            }
            for(int col=2;col<=r;col++){
                System.out.print("*");
            }
            for(int col=1;col<=r;col++){
                System.out.print("*");
            }
            for(int s=1 ; s<=(2 *(n-r))/2 ; s++){
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}
