package com.vishal.oopsExamples.genericsDemo;

import java.util.Arrays;

public class CustomArrayListGenrics<V> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomArrayListGenrics() {
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(V num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    public V remove(){
        V removed= (V) data[--size];
        return removed;
    }
    public V get(int index){
        return (V)(data[index]);
    }
    private void resize() {
        Object[] temp=new Object[data.length*2];
        //copy the current items into new array
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public int size(){
        return size;
    }
    public void set(int index,int value){
        data[index]=value;
    }
    private boolean isFull() {
        return size==data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{ "+
                "data=" + Arrays.toString(data)  +
                ",size=" +size+'}';
    }

    public static void main(String[] args) {
//        CustomArrayListGenrics list=new CustomArrayListGenrics();
//        list.add(6);
//        list.add(8);
//        list.add(9);
//        list.add(10);
//
//        System.out.println(list);
//        System.out.println(list.remove());
        CustomArrayListGenrics<String> list=new CustomArrayListGenrics<>();
        //list.add(4);
       // System.out.println(list);
        for(int i=0;i<14;i++){
            list.add("Vishal");
        }
        System.out.println(list);

    }
}
