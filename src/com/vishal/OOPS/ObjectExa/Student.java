package com.vishal.OOPS.ObjectExa;

public class Student {
    static  int _id=123;
    String name;
    int roll;

    //every class has a default constructor
//    Student(){
//        System.out.println("Default constructor will be called");
//    }
    Student (String name){
        this.name=name;
    }
    //Constructor Overloading
    Student(String name,int roll,int id){
        this.name=name;
        this.roll=roll;
        this._id=id;
    }
    Student(Student other){
        this.name=other.name;
        this.roll=other.roll;
        this._id=other._id;
    }

    public void showDetails(){
        System.out.println("Name is :"+this.name +"Roll is :"+this.roll);
    }
    String changeName(String newName){
        return this.name=newName;
    }
}

