package com.vishal.DataStruture.MathsDsa;

public class SetBit {
    public static void main(String[] args) {
        int num=16;
        int count=0;
        while(num>0){
            if((num&1)==1){
                count+=1;
            }
            num=num>>1;
        }
        System.out.println("Set bits are = "+count);
    }

}
