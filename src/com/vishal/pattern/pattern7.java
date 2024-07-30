package com.vishal.pattern;
//___****
//__*****
//_*****
//****
public class pattern7 {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        for( int r=1;r<=n ;r++){
            for(int s=r ;s<=n-1 ;s++){
                System.out.print(" ");
            }
            for( int col=1; col<= n;col++){
                System.out.print("*" +" ");
            }

            System.out.println();
        }
    }
}
