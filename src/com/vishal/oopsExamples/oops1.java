package com.vishal.oopsExamples;

public class oops1 {
    int roll;
    String name;
    float marks;

    oops1(){
        this(24,"vishal",78.0f);
        System.out.println("Default Constructor");

    }
    oops1(int roll, String name){

        this.roll=roll;
        this.name=name;
    }
    oops1(int roll,String name,float marks){

        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }
    void print(){
        System.out.println("Name :"+name);
        System.out.println("Roll No :"+roll);
        System.out.println("Marks :"+marks);
    }
    void changeName(String newName){
        this.name = newName;
    }
    void show(){
        System.out.println("Student Details::::");
    }
}
class Main{
    public static void main(String[] args) {
        oops1 obj=new oops1();
        oops1 obj2=new oops1(23,"vishal",89.0f);
        //obj.print();
        oops1 obj3=new oops1(23, "tanishk");
        // obj2.print();
        //obj2=obj3;//obj3 refer to object 2.
        //obj2.print();
        obj2.print();
        obj.print();
        // obj=obj3;
        // obj.print();

        // obj2.changeName("Dishu");
        // System.out.println("After named changed");
        // obj2.print();
        // obj.changeName("Kandari");
        // obj.print();

    }
}
