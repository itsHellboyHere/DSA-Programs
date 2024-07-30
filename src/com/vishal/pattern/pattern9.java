package com.vishal.pattern;

//        *          *
//        **        **
//        ***      ***
//        ****    ****
//        *****  *****
//        ************
//        ************
//        *****  *****
//        ****    ****
//        ***      ***
//        **        **
//        *          *
public class pattern9 {
    public static void main(String[] args) {
        print(6);
    }
    public static void print(int n){
        // first part
        for(int r=1; r<=n;r++){
            for(int col =1; col <=r;col ++){
                System.out.print("*");
            }
            for(int s =1; s<= 2 *(n-r) ; s++){
                System.out.print(" ");
            }
            for(int col =1; col <=r;col ++){
                System.out.print("*");
            }
            System.out.println();
        }
        // second part
        for(int r=n; r>=1;r--){
            for(int col =1; col <=r;col ++){
                System.out.print("*");
            }
            for(int s =1; s<= 2 *(n-r) ; s++){
                System.out.print(" ");
            }
            for(int col =1; col <=r;col ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
