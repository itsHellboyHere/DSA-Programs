package com.vishal.OOPS.ObjectExa;

public class test {
    test(){
        System.out.println("hye im defa construc...");
    }
    public void drive(String s){
        System.out.println("I drive :"+s);
    }
}
class TestSon extends test {

    public void drive(String s) {
        System.out.println("TestSon drives: " + s);
    }
}

 class Main {
    public static void main(String[] args) {
        test myTest = new test();
        TestSon myTestSon = new TestSon();

        myTest.drive("a car");
        myTestSon.drive("a bicycle");
    }
}

