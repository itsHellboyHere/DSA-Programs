package com.vishal.oopsExamples.Scope;

public class ObjectDemo{
    int num;
    String name;
    // double val;
    public ObjectDemo(int num,String name) {
        this.num = num;
        this.name=name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num ==((ObjectDemo)obj).num && this.name==((ObjectDemo)obj).name;
    }

    public static void main(String[] args) {
        ObjectDemo obj1=new ObjectDemo(24,"vishal");
        ObjectDemo obj2=new ObjectDemo(24,"vishal");
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        if(obj1.equals(obj2)){
            System.out.println("Both are equal");
        }
        else {  
            System.out.println("not equal");
        }
    }
}
