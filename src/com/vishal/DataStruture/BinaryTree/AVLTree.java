package com.vishal.DataStruture.BinaryTree;

public class AVLTree {

   private static class Node{
        private int value;
        private int height;
        Node left;
        Node right;

        Node(int value){
            this.value=value;
        }

       public int getValue() {
           return value;
       }
   }
   private Node root;
    AVLTree(){

    }
    public int height(){
       return height(root);
    }
    private int height(Node node){
       if(node==null){
           return -1;
       }
       return node.height;
    }
    public boolean leanisEmpty(){
        return (root==null);
    }
    public void insert(int value){
        root=insert(root,value);
    }
    private Node  insert(Node node,int value){
        if(node==null){
            node =new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(node.left,value);
        }
        if(value > node.value){
            node.right=insert(node.right,value);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return rotate(node) ;
    }

    public boolean isBalanced(){
       return isBalanced(root);
    }
    private boolean isBalanced(Node node){
        if(node==null){
            return  true;
        }
        return Math.abs((height(node.left))-height(node.right))<=1 && isBalanced(node.left) && isBalanced(node.right);
    }
    public void populate(int[] nums){
        for(int n:nums){
            insert(n);
        }
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

    //rotate
    private Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
            //left heavy:as height of left node is positive
            //left-left case
            if(height(node.left.left)-height(node.left.right)>0) {
                return rightRotate(node);
            }
            //left-right case
            if(height(node.left.left)-height(node.left.right)<0){
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
        }
        //right heavy:as height of right node is postive
        if(height(node.left)-height(node.right)<-1){
            //right-right case
            if(height(node.right.left)-height(node.right.right)<0){
                    return leftRotate(node);
            }
            if(height(node.right.left)-height(node.right.right) >0){
                //right-left case
                node.right=rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }
    public Node  rightRotate(Node p){
        Node c=p.left;
        Node t=c.right;

        c.right=p;
        p.left=t;
        p.height=Math.max(height(p.left),height(p.right))+1;
        c.height=Math.max(height(c.left),height(c.right))+1;
        return c;
    }
    public Node  leftRotate(Node c){
        Node p=c.right;
        Node t=p.left;
        p.left=c;
        c.right=t;
        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);
        return p;
    }
}
