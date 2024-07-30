package com.vishal.oopsExamples.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human vishal=new Human(22,"Vishal");
        Human twin=(Human)vishal.clone();
//
//        System.out.println(vishal.age+" "+vishal.name);
//        System.out.println("---------------");
//        System.out.println(twin.age+" "+twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0]=10;
        System.out.println("Twin Array: "+Arrays.toString(twin.arr));
        System.out.println("Vishal Array: "+Arrays.toString(vishal.arr));
    }
}
