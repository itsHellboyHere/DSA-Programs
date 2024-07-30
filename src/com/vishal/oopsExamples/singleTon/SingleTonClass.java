package com.vishal.oopsExamples.singleTon;

public class SingleTonClass {
    private SingleTonClass(){

    }
    private  static SingleTonClass instance;

    public static SingleTonClass getInstance(){
        //it will check if their is one object or not.
        //if null then it will create an object.
        if(instance==null){
            System.out.println("Object is created.");
            instance=new SingleTonClass();
        }
        return instance;
    }
}
