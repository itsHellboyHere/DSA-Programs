package com.vishal.DataStruture.BinaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Btree tree=new Btree();
        int [] preoder={3,9,20,15,7};
        int [] inorder={9,3,15,20,7};
        tree.buildTree(preoder,inorder);

//        tree.populate(sc);
        tree.display();
//        tree.LevelOrderTraversal();
//        tree.prettyDisplay();
        BinarySearchTree btree= new BinarySearchTree();
        int arr[]={};
        btree.populate(arr);
        btree.display();
//        boolean balance=btree.balanced();
//        System.out.println(balance);
////        btree.inorder();
////        System.out.println();
////        btree.preorder();
////        System.out.println();
////        btree.postorder();
//        btree.populatesort(arr,0,arr.length);
//        btree.display();
//        btree.inorder();
//        AVLTree tree = new AVLTree();

//        for(int i=0; i < 1000; i++) {
//            tree.insert(i);
//        }
//
//        System.out.println(tree.height());
//        System.out.println(tree.isBalanced());

//        int arr[]={-2,-4,3,4,6,1,-10,3};
//        SegmentTree tree=new SegmentTree(arr);
////        tree.display()
//        System.out.println(tree.query(2, 4));
    }
    }
