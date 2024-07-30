package com.vishal.DataStruture.BinaryTree;

import java.util.*;

public  class Btree{

    private static  class  Node{
        private  int value;

        Node left;
        Node right;

        Node(int value){
            this.value=value;
        }

    }
    Btree(){

    }
    Node root;

    public void populate(Scanner sc){
        System.out.println("Enter the root Node: ");
        int value=sc.nextInt();
        root=new Node(value);
        populate(sc,root);
    }
    private void populate(Scanner sc ,Node node){
        System.out.println("Do you want to insert in the left of :"+node.value);
        Boolean left=sc.nextBoolean();
        if(left){
            System.out.println("enter the value of the left of :"+node.value);
            int value=sc.nextInt();
            node.left=new Node(value);
            populate(sc,node.left);
        }
        System.out.println("Do you want to insert in the right of :"+node.value);
        Boolean right=sc.nextBoolean();
        if(right){
            System.out.println("enter the value of the left of :"+node.value);
            int value=sc.nextInt();
            node.right=new Node(value);
            populate(sc,node.right);
        }
    }
    int idx=0;
    Map<Integer,Integer> map=new HashMap<>();
    public Node buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
//        System.out.println(map);
        return helper(preorder, 0,preorder.length-1);
    }
    public Node helper(int[] preorder,int left,int right){
        if(left>right){
            return null;
        }
        int rootvalue=preorder[idx++];
        Node root=new Node(rootvalue);
        root.left=helper(preorder,left,map.get(rootvalue)-1);
        root.right=helper(preorder,map.get(rootvalue)+1,right);
        return root;
    }

    public void display(){
        display(root,"");
    }
    private void display(Node node,String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }
   


}