package com.vishal.oopsExamples.abstractionDemo;

public class Main {
    public static void main(String[] args) {
        Son obj=new Son();
        obj.career("Coder");
        obj.partner("Unknown",20);
        obj.details();
        Parent.show();
        System.out.println(obj.VALUE);
    }
}
