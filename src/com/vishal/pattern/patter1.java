package com.vishal.pattern;

public class patter1 {
    public static void main(String[] args) {
        print();
    }
    //1
    //12
    //123
    //1234
    //12345
    public static void print() {
        int n = 5;
        for (int r = 1; r <= n; r++) {
            for (int col = 1; col <= r; col++) {

                System.out.print(col);
            }
            System.out.println();
        }
    }
}
