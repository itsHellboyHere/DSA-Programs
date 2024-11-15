package com.vishal.DataStruture.BinaryTree;


import com.vishal.oopsExamples.Scope.A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BTree2 {
    Node root;
    BTree2(){};

    private Node findLca(Node root,Node target, Node q){
        if(root==null){
            return null;
        }
        if (root == target || root == q) {
            return root;
        }
        Node left=findLca(root.left,target,q);
        Node right= findLca(root.right,target,q);

        if(left!=null && right!=null){
            return root;
        }
        return left!=null?target:q;
    }
    private int findDistanceBetweenNodes(Node root, Node node, HashMap<Node,Integer> dismap,int distance){
        if(root==null){
            return -1;
        }
        if(root==node){
            dismap.put(root,distance);
            return 0;
        }
        int left=findDistanceBetweenNodes(root.left,node,dismap,distance+1);
        if(left!=-1){
            dismap.put(root,distance);
            return left+1;
        }
        int right=findDistanceBetweenNodes(root.right,node,dismap,distance+1);

        if(right!=-1){
            dismap.put(root,distance);
            return right+1;
        }
        return -1;
    }

    List<Integer> ans= new ArrayList<>();


    public List<Integer> nodesAtdistancek(Node root,Node target,int k){

            HashMap<Node,Integer> map = new HashMap<>();
            findDistanceBetweenNodes(root,target,map,0);
            List<Integer> ans= new ArrayList<>();
            for(Node node :map.keySet()){
                if(map.get(node)==k){
                    ans.add(node.value);
                }
            }
        System.out.println(ans);
            return ans;
    }

}
class Run2{
    public static void main(String[] args) {
        BTree2 tree=new BTree2();
        tree.root=new Node(20);
        tree.root.left=new Node(8);
        tree.root.right=new Node(22);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(12);
        tree.root.left.right.left=new Node(10);
        tree.root.left.right.right=new Node(14);
        Node target=new Node(8);
        int k=2;
        List<Integer> ans = tree.nodesAtdistancek(tree.root,target,k);
        System.out.println("Nodes at distance " + k + " from target: " + ans);
    }
}
