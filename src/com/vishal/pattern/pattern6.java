package com.vishal.pattern;
//___1___
//__212__
//_32123_
//4321234
public class pattern6 {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        for(int r=1;r<=n;r++){
            for(int s =1; s <=(2 *(n-r))/2 ; s++){
                System.out.print(" ");
            }
            for(int col =r;col >=2 ;col --){
                System.out.print("*");
            }
            for(int col =1; col <=r ;col++){
                System.out.print("*  ");
            }
            for(int s =1; s <=(2 *(n-r))/2 ; s++){
                System.out.print(" ");
            }


            System.out.println();
        }
    }
}
