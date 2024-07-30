package com.vishal.oopsExamples.singleTon;
import com.vishal.oopsExamples.Scope.A;
import com.vishal.oopsExamples.Scope.Subclass;

public class SubClass extends A{

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj=  new SubClass(23,"vishal");
        System.out.println(obj.getNum());
    }
}
