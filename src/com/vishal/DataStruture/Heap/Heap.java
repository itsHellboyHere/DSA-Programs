package com.vishal.DataStructure.Heap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Heap {
    private static class Node {
        private int value;
        Node left;
        Node right;

        Node(int val) {
            this.value = val;
        }
    }

    private Node root;

    // Insertion in heap
    public void insert(int val) {
        if (root == null) {
            root = new Node(val);
            return;
        }

        // Level order traversal to maintain the complete binary tree property
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.left == null) {
                current.left = new Node(val);
                heapifyUp(current.left);
                break;
            } else {
                queue.add(current.left);
            }
            if (current.right == null) {
                current.right = new Node(val);
                heapifyUp(current.right);
                break;
            } else {
                queue.add(current.right);
            }
        }
    }

    // Heapify to maintain the max-heap property
    private void heapifyUp(Node node) {
        if (node == null || node == root) {
            return;
        }

        Node parent = findParent(root, node);
        if (parent != null && parent.value < node.value) {
//            System.out.println("before value" + parent.value);
            int temp = parent.value;
            parent.value = node.value;
            node.value = temp;
//            System.out.println("after value " +parent.value);
            heapifyUp(parent);
        }
    }

    // Function to find the parent of the node
    private Node findParent(Node root, Node node) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.left == node || current.right == node) {
                return current;
            }
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        return null;
    }
    // Function to find the lastNode of the binary tree.
    public Node  findLastNode(){
        if(root == null){
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node lastNode = null;
        while(!queue.isEmpty()){
            lastNode = queue.poll();
            if(lastNode.left != null){
                queue.add(lastNode.left);
            }
            if(lastNode.right != null){
                queue.add(lastNode.right);
            }
        }
        return lastNode;
    }
    // heapify-down after deletion of root node
    // do it recursively of every child.
    public void heapifyDown(Node node){
        if(node == null){
            return;
        }
        Node largest = node;
        if(node.left!= null && node.left.value > largest.value){
            largest= node.left;
        }
        if(node.right!=null && node.right.value> largest.value){
            largest= node.right;
        }
        if(largest!=node){
            int temp = node.value;
            node.value=largest.value;
            largest.value=temp;
            heapifyDown(largest);
        }
    }

    // deleteion of heap
    public void delete(){
        if(root == null){
            return;
        }
        Node lastNode = findLastNode();
        if(lastNode == root){
            root=null;
        }
        else {
            Node parentOfLastNode= findParent(root,lastNode);
            if(parentOfLastNode.left == lastNode){
                parentOfLastNode.left=null;
            }
            if(parentOfLastNode.right == lastNode){
                parentOfLastNode.right=null;
            }
            root.value=lastNode.value;
            heapifyDown(root);
        }
    }
    public int peak(){
        if(root== null){
            return -1;
        }
        return root.value;
    }
    // Print heap in level-order
    public void printHeap() {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            while (levelSize > 0) {
                Node current = queue.poll();
                System.out.print(current.value + " ");
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
                levelSize--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
//        heap.insert(7);
//        heap.insert(10);
//        heap.insert(5);
//        heap.insert(20);
//        heap.insert(15);
//        heap.insert(30);
        int arr[] ={7,10,5,20,15,30};
        for(int i : arr){
            heap.insert(i);
        }
//        heap.printHeap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the kth value => ");
        int k = sc.nextInt();
        for (int i =1 ; i<k;i++){
               heap.delete();
        }
        heap.printHeap();
        System.out.println("Top element of heap is =>"+heap.peak());

    }

}
