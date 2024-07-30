package com.vishal.oopsExamples.Cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;
    public Human(int age,String name) {
        this.age = age;
        this.name=name;
        this.arr=new int[]{3,4,5,6,7};
    }
//    @Override
//    public Object clone() throws  CloneNotSupportedException{
//            return super.clone();//this is shallow copy.
//    }
    @Override
    public Object clone() throws  CloneNotSupportedException{
        //this is deep copy
        Human twin=(Human)super.clone();
        twin.arr=new int[twin.arr.length];
        for(int i=0;i<twin.arr.length;i++){
            twin.arr[i]=this.arr[i];
        }
        return twin;
    }
}
