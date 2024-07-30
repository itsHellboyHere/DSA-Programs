package com.vishal.oopsExamples.genericsDemo;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    public int remove(){
        int removed=data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    private void resize() {
        int[] temp=new int[data.length*2];
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
        CustomArrayList list=new CustomArrayList();
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(list);
        System.out.println(list.remove());
    }
}
