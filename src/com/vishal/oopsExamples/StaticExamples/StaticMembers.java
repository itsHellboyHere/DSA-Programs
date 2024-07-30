package com.vishal.oopsExamples.StaticExamples;
//EXAMPLE OF A STATIC VARIABLE.
public class StaticMembers {
    public static void main(String[] args) {
        //fun();
       // greeting();
//        StaticMembers obj=new StaticMembers();
//        obj.greeting();
    }
    static void fun(){
        System.out.println("Im called!.");
        //you can't access not static members without referencing their instant so we have to create Reference variables
        //for accessing not static members.
        StaticMembers obj=new StaticMembers();
        obj.greeting();
    }
    //something which is not static belongs to object.
    void greeting(){
        fun();
        System.out.println("Hello!");
    }
}
