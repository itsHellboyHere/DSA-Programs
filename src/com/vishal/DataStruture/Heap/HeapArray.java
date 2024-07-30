package com.vishal.DataStruture.Heap;

public class HeapArray {
   static class Maxheap{
       private int[] Heap;
       private int maxsize;
       private int size;
       Maxheap(int size){
           this.maxsize=size;
           this.size=0;
           Heap=new int[this.maxsize+1];
           Heap[0]=Integer.MAX_VALUE;//making the first index as infintity and starting from index 1

       }
       private int parent(int pos){
           return  pos/2;  //parent node=i/2;
       }
       private int leftchild(int pos){
           return (2*pos); //lchild=2*i;
       }
       private int rightchild(int pos){
           return (2*pos)+1;  //rchild=2*i+1;
       }
       //heapify
       //we need to adjust the locations of the heap to make it heap again. This process is called Heapifying.
       //downheapify :moving downward from parent to leaf node
       //heapify is only performed in non-leaf nodes.
       private void downHeapify(int pos){
           //check for leaf node
           if(pos>=(size/2)&&pos<=size){
               return;
           }
           //check for swap
           if(Heap[pos]<Heap[leftchild(pos)]||
           Heap[pos]<Heap[rightchild(pos)]){
       //replacing the parent with maximum of left and right node.
                if(Heap[leftchild(pos)]>Heap[rightchild(pos)]) {
                    swap(pos, leftchild(pos));

                    //after swapping heapify is called for the children recursively.
                    downHeapify(leftchild(pos));
                }
                else{
                    swap(pos,rightchild(pos));
                    downHeapify(rightchild(pos));
               }
           }
       }

       private void swap(int a, int b) {
           int temp=Heap[a];
           Heap[a]=Heap[b];
           Heap[b]=temp;
       }
       //upheapify :compare node to its parent and swaping places.
       //its a up-ward approach
       private  void heapifyUp(int pos){
           int temp=Heap[pos];
           while(pos>0&&temp>Heap[parent(pos)]){ //loop we run till it reach root node and the current element
               //is graeter then the parent.
               Heap[pos]=Heap[parent(pos)];
               pos=parent(pos);
           }
           Heap[pos]=temp;
       }
       //inserting elements
       private void insert(int element){
           Heap[++size]=element;//put the new element at the last index of the array.
           //increase the heap size
           int current=size;
           heapifyUp(current);//Heapify from bottom to top.
       }
       private int delete(){
           //deletion from max heap always gives the largest element.
           //deletion is always from the root of the max heap.
           int max=Heap[1];//copy the root value in a new variable.
           Heap[1]=Heap[size--];//putting the last index element to the root/first index.
           downHeapify(1);
            return  max;
       }
       public void print() {
           for (int i = 1; i <= size / 2; i++) {
               System.out.print(+ Heap[i] + ": L- " +
                       Heap[2 * i] + " R- " + Heap[2 * i + 1]);
               System.out.println();
           }
       }

   }
    public static void main(String[] args) {
                Maxheap heap=new Maxheap(10);
                heap.insert(4);
                heap.insert(3);
                heap.insert(10);
                heap.insert(30);
                heap.insert(20);
                heap.insert(12);
                heap.insert(15);
                heap.print();



        for(int i=0;i<=heap.size+1;i++){
            System.out.println("Max value is : "+heap.delete());
//            if(i>heap.size){
//                break;
//            }
        }
    }
}
