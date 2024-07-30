package com.vishal.oopsExamples.StaticExamples;

public class Main {
    public static void main(String[] args) {
        Human vishal=new Human(22,"Vishal",60000,false);
        System.out.println("Age is :"+vishal.age);
       // System.out.println("Popluation:"+vishal.population);
        Human aman=new Human(27,"aman",70000,false);
        System.out.println("population :"+aman.population);
        System.out.println("Population:"+vishal.population);


    }
}

