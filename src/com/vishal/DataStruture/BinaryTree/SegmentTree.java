package com.vishal.DataStruture.BinaryTree;
 class SegmentTree {
    private static class Node {
         int data;
         int startIndex;
         int endIndex;

        Node left;
        Node right;

        public Node(int startIndex, int endIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }
    }
        Node root;
        public SegmentTree(int arr[]){
            this.root=constructTree(arr,0,arr.length-1);
        }
        private Node constructTree(int arr[],int start,int end){
            if(start==end){
                //leaf node
                Node leaf =new Node(start,end);
                leaf.data=arr[start];
                return  leaf;
            }
            //create a new node with ur at.
            Node node =new Node(start,end);
            int mid=(start+end)/2;
            node.left=constructTree(arr,start,mid);
            node.right=constructTree(arr,mid+1,end);
            node.data=node.left.data+node.right.data;
            return node;
        }
        public void display(){
            display(this.root);
        }
        private void  display(Node node){
            String str="";
            if(node.left!=null){
                str="Interval =["+node.left.startIndex+"-"+ node.left.endIndex+"] and data:" +node.left.data+"=>";

            }else{
                str="no left child";
            }

            str="Interval =["+node.startIndex+"-"+ node.endIndex+"] and data:" +node.data+"=>";


            if(node.right!=null){
                str="Interval =["+node.right.startIndex+"-"+ node.right.endIndex+"] and data:" +node.right.data+"=>";

            }else{
                str="no right child";
            }
            System.out.println(str);
            if(node.left!=null){
                display(node.left);
            }
            if(node.right!=null){
                display(node.right);
            }
        }
        //query
     public int query(int qsi,int qei){
          return query(root,qsi,qei);
     }
    private int query(Node node,int qsi,int qei){
            if(node.startIndex>=qsi && node.endIndex <=qei){
                return  node.data;
            }else if(node.startIndex >qei || node.endIndex <qsi){
                //completeley outside
                return 0;
            }
            else{
                return query(node.left,qsi,qei) + query(node.right,qsi,qei);
            }
    }
    public void update(int index,int value){
           this.root.data=update(root,index,value);
    } 
    private int update(Node node,int index,int value){
            if(index>= node.startIndex && index<=node.endIndex){
                if(index==node.startIndex& index==node.endIndex){
                    node.data=value;
                    return node.data;
                }else {
                    int left = update(node.left, index, value);
                    int right = update(node.right, index, value);
                    node.data = left + right;
                    return node.data;
                }
            }
        return node.data;
    }

}
