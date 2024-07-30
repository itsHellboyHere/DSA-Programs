package com.vishal.oopsExamples.StaticExamples;

public class InnerClass {
    static class  Test {
        String name;

        public Test(String name) {
            this.name = name;
        }

}

    public static void main(String[] args) {
        Test a=new Test("vishal");
        Test b=new Test("aman");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
