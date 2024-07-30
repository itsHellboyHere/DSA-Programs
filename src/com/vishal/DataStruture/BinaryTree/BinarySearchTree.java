package com.vishal.DataStruture.BinaryTree;

public class BinarySearchTree {

    private static class Node{
        private int value;
        private int height;
        Node left;
        Node right;
        public Node (int value) {
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    BinarySearchTree(){

    }
    private Node root;
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void insert(int value){
        root=insert(root,value);
    }
    private Node insert(Node node,int value){
        if(node==null){
            node =new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(node.left,value);
        }
        if(value>node.value){
            node.right=insert(node.right,value);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
    }
    public boolean balanced(){
       return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 &&balanced(node.left)&&balanced(node.right);
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }
    public void populatesort(int[] nums,int s,int e){
        if(s>=e){
            return;
        }
        
        int mid=s+(e-s)/2;
        insert(nums[mid]);
        populatesort(nums,s,mid);
        populatesort(nums,mid+1,e);

    }
    public void display(){
        display(root,"Root Node :");
    }

    private void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.value);
        display(node.left,"left side of  "+node.value+" : ");
        display(node.right,"right side of  "+node.value+" : ");
    }
    public void preorder(){
        preorder(root);
    }
    private void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.value);
        preorder(node.left);
        preorder(node.right);
    }
    public void inorder(){
        inorder(root);
    }
    private void inorder(Node node){ //always gives the tree in sorted order.
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.print(" "+node.value);
        inorder(node.right);
    }
    public void postorder(){
        postorder(root);
    }
    private void postorder(Node node){
        if(node==null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(" "+node.value);
    }
}
