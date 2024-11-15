package com.vishal.DataStruture.BinaryTree;


import java.util.*;
import java.util.stream.Stream;


class Node {
    int value;
    public Node left;
    public Node right;
    Node(int value){
        this.value=value;
        left=right=null;
    }

}

public class BinaryTree {


    Node root;

    BinaryTree() {

    }

    public void insert(int value) {
        root = insert(root, value);

    }

    public Node insert(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (node.left == null) {
            node.left = insert(node.left, value);
        } else if (node.right == null) {
            node.right = insert(node.right, value);
        } else {
            node.left = insert(node.left, value);
        }
        return node;
    }

    public void populate(int[] arr) {
        for (int num : arr) {
            insert(num);
        }
    }

    public void display() {
        inorder(root);
    }

    private void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }

    public int findHeight() {
        return findHeight(root);
    }

    private int findHeight(Node node) {
        if (node == null) {
            return 0;
        }
        int left = findHeight(node.left);
        int right = findHeight(node.right);
        return Math.max(left, right) + 1;
    }

    public int heightwithBFS() {
        return heightwithBFS(root);
    }

    int diameter = 0;

    public int findDiameter() {
        helper(root);
        return diameter;
    }

    private int helper(Node root) {
        if (root == null) {
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        diameter = Math.max(diameter, left + right);
        return Math.max(left, right) + 1;
    }

    private int heightwithBFS(Node node) {
        if (node == null) {
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int height = 0;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            height++;
            for (int i = 0; i < levelSize; i++) {
                Node curr = queue.poll();
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
        return height;
    }

    //    public int sum=0;
    public int findSum() {
//        return findSum(root);
        return findSum2(root);
    }

    private int findSum(Node node) {
        if (node == null) {
            return 0;
        }
//        sum+=node.value;
        int left = findSum(node.left);
        int right = findSum(node.right);
        return node.value + left + right;
    }

    private int findSum2(Node node) {
        if (node == null) {
            return 0;
        }
        int sum = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            sum += curr.value;
            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }

        }
        return sum;
    }

    public Node makeBST(int[] nums) {
        return binaryhelper(0, nums.length - 1, nums);
    }

    private Node binaryhelper(int s, int e, int[] nums) {
        if (s > e) {
            return null;
        }
        int mid = (s + e) / 2;
        Node root = new Node(nums[mid]);
        root.left = binaryhelper(0, mid - 1, nums);
        root.right = binaryhelper(mid + 1, e, nums);

        return root;
    }

    public int findMaxgcd(Node node) {
        if (node == null) {
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        int maxgcd = Integer.MIN_VALUE;
        queue.add(node);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            if (curr.left != null && curr.right != null) {
                int cgcd = gcd(curr.left.value, curr.right.value);
                maxgcd = Math.max(cgcd, maxgcd);
            }
            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }
        }
        return maxgcd;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }


    MinMax minMax = new MinMax();

    private void findMinMax(Node node, MinMax minMax, int hd) {
        if (node == null) {
            return;
        }
        if (hd < minMax.min) {
            minMax.min = hd;
        } else if (hd > minMax.max) {
            minMax.max = hd;
        }
        findMinMax(node.left, minMax, hd - 1);
        findMinMax(node.right, minMax, hd + 1);
    }

    public void findMinmax() {

        findMinMax(root, minMax, 0);
        System.out.println("Min: " + minMax.min + ", Max: " + minMax.max);
    }

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> verticalOrder() {
        return verticalOrderTraversal(root);
    }

    private List<List<Integer>> verticalOrderTraversal(Node node) {
        findMinmax();

        for (int line_no = minMax.min; line_no <= minMax.max; line_no++) {
            List<Integer> ans = new ArrayList<>();
            findVertical(root, line_no, 0, ans);
            res.add(ans);
        }
        return res;
    }

    private void findVertical(Node node, int line, int hd, List<Integer> ans) {
        if (node == null) {
            return;
        }
        if (line == hd) {
            ans.add(node.value);
        }
        findVertical(node.left, line, hd - 1, ans);
        findVertical(node.right, line, hd + 1, ans);
    }

    public void printLeaves(Node node, List<Integer> ans) {
        if (node == null) {
            return;
        }
        printLeaves(node.left, ans);
        if (node.left == null && node.right == null) {
            System.out.print(node.value + " ");
            ans.add(node.value);
        }
        printLeaves(node.right, ans);
    }

    public void printLeft(Node node, List<Integer> ans) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            System.out.print(node.value + " ");
            ans.add(node.value);
            printLeft(node.left, ans);
        } else if (node.right != null) {
            System.out.print(node.value + " ");
            ans.add(node.value);
            printLeft(node.right, ans);
        }
    }

    public void printRight(Node node, List<Integer> ans) {
        if (node == null) {
            return;
        }
        if (node.right != null) {
            printRight(node.right, ans);
            System.out.print(node.value + " ");
            ans.add(node.value);
        } else if (node.left != null) {
            printRight(node.left, ans);
            System.out.print(node.value + " ");
            ans.add(node.value);
        }
    }

    public void boundaryTraversal() {
        boundaryTraversal(root, ans);
    }

    List<Integer> ans = new ArrayList<>();

    private void boundaryTraversal(Node node, List<Integer> ans) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        ans.add(node.value);
        printLeft(node.left, ans);

        printLeaves(node.left, ans);

        printLeaves(node.right, ans);

        printRight(node.right, ans);

    }

    public Node constructTree(int[] parent) {
        return constructTree(root, parent);
    }

    private void construct(int[] parent, int i, Node[] created) {
//        [1, 5, 5, 2, 2,-1, 3]       created- [0,1]
//         0, 1, 2, 3, 4, 5, 6

        if (created[i] != null) {
            return;
        }
        created[i] = new Node(i);
        if (parent[i] == -1) {
            root = created[i];
        }
        if (created[parent[i]] == null) {
            construct(parent, parent[i], created);
        }
        Node p = created[parent[i]];
        if (p.left == null) {
            p.left = created[i];
        } else {
            p.right = created[i];
        }
    }

    private Node constructTree(Node node, int[] parent) {
        // an array to check node created.
        Node[] created = new Node[parent.length];
        // put null at every index.
        for (int i = 0; i < created.length; i++) {
            created[i] = null;
        }
        for (int i = 0; i < parent.length; i++) {
            construct(parent, i, created);
        }

        return root;
    }

    public void createTree(int value) {
        root = createTree(root, value);
    }

    private Node createTree(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = createTree(node.left, value);
        }
        if (value > node.value) {
            node.right = createTree(node.right, value);
        }
        return node;
    }

    public void preOrder() {
        preOrder(root);
    }

    public List<Integer> pre = new ArrayList<>();

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        //root
        System.out.println(node.value + " ");
        pre.add(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void populateTree(int[] arr) {
        for (int num : arr) {
            createTree(num);
        }
    }

    public int checkPreWithBST(int[] pre) {
        Stack<Integer> stack = new Stack<>();
        int root = Integer.MIN_VALUE;
        for (int i = 0; i < pre.length; i++) {
            // current  value less then root
            // then return false.
            if (pre[i] < root) {
                return 0;
            }
            //compare the element with the current value
            // if it is less then pre[i] pop it
            // and make it root for comparing next.
            while (!stack.isEmpty() && stack.peek() < pre[i]) {
                root = stack.peek();
                stack.pop();
            }
            //at this time either stack is empty
            // pre[i] is smaller push it in stack to compare next.
            stack.push(pre[i]);
        }
        // no smaller value found in the right side of root.
        return 1;
    }

    HashMap<Node, List<List<Node>>> lcamap = new HashMap<>();

    public void findLca() {

        findLca(root);
    }

    private void findLca(Node node) {
        if (node == null) {
            return;
        }
        findLca(node.left);
        findLca(node.right);
        if (node.left != null && node.right != null) {
            List<List<Node>> childrens = lcamap.getOrDefault(node, new ArrayList<>());
            List<Node> child = new ArrayList<>();
            child.add(node.left);
            child.add(node.right);
            childrens.add(child);
            lcamap.put(node, childrens);
        }
    }

    public void printLca() {
        for (Map.Entry<Node, List<List<Node>>> entry : lcamap.entrySet()) {
            Node key = entry.getKey();
            List<List<Node>> childrens = entry.getValue();
            System.out.println("Node :" + key.value + " -> Children pairs: " + valueToString(childrens));
        }


    }

    public String valueToString(List<List<Node>> list) {
        StringBuilder sb = new StringBuilder();
        for (List<Node> value : list) {
            sb.append("[");
            for (Node n : value) {
                sb.append(n.value).append(" ");
            }
            sb.append("] ");
        }
        return sb.toString();
    }

    public Node findLCAOfTree() {
        Node p = new Node(4);
        Node q = new Node(6);
        Node ans = findLCAOfTree(root, p, q);
        System.out.println("Lca of p " + "&" + "q " + "->" + ans.value);
        return ans;
    }

    private Node findLCAOfTree(Node root, Node p, Node q) {
        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root;
        }
        Node left = findLCAOfTree(root.left, p, q);
        Node right = findLCAOfTree(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        return left != null ? p : q;
    }

    public int findDistance(Node root, Node p, Node q) {
        Node lca = findLCAOfTree(root,p,q);
        int disp = findDistanceWithLcs(lca, p);
        int disq = findDistanceWithLcs(lca, q);

        return disp + disq;
    }

    private int findDistanceWithLcs(Node root, Node target) {
        if (root == null) {
            return -1;
        }
        if (root == target) {
            return 0;
        }
        int leftdis = findDistanceWithLcs(root.left, target);
        int rightdis = findDistanceWithLcs(root.right, target);

        if (leftdis != -1) {
            return leftdis + 1;
        }
        if (rightdis != -1) {
            return rightdis + 1;
        }
        return -1;
    }

    public int finddifofsumAtlevel(){
        return finddifofsumAtlevel(root);
    }
    private int finddifofsumAtlevel(Node node){
        if(node==null){
            return 0;
        }
        Queue<Node> queue= new LinkedList<>();
        queue.add(node);
        int level=1;
        int esum=0;
        int osum=0;
        while (!queue.isEmpty()){
           int size= queue.size();
           for(int i=1;i<=size;i++){
               Node curr = queue.poll();
               if(level%2==0){
                   esum+=curr.value;
               }
               else{
                   osum+=curr.value;
               }
               if(curr.left!=null){
                   queue.add(curr.left);
               }
               if(curr.right!=null){
                   queue.add(curr.right);
               }
           }
           level++;
        }
        return osum-esum;
    }
    public void printsumDiffoflevel(){
        int ans=finddifofsumAtlevel();
        System.out.println("diff of sum is => "+ans);
    }

    public int count(Node node){
        if(node==null){
            return 0;
        }
        int left=count(node.left);
        int right=count(node.right);
        return left+right +1;
    }
    public void printCount(){
        int ans = count(root);
        System.out.println("Count => "+ans);
    }

    public void largestBst(){
       int ans= largestBst(root);
    }
    private boolean checkBST(Node node,int min,int max){
        if(node==null){
            return true;
        }
        if(node.value<= min || node.value>=max){
               return false;
        }
        return checkBST(node.left,min,node.value) && checkBST(node.right, node.value, max);

    }
    private int largestBst(Node node){
        if(node== null ){
            return 0;
        }
        if(checkBST(node,Integer.MIN_VALUE,Integer.MAX_VALUE)){
            return count(node);
        }
        return Math.max(largestBst(node.left),largestBst(node.right));

    }
    public void printLargestBST(){
//        int ans = largestBst(root);

    }

    public int largestbst(){
        return largestBSTHelper(root).size;
    }
    public NodeInfo largestBSTHelper(Node node){
        if(node==null){
            return new NodeInfo(true,0,Integer.MIN_VALUE,Integer.MAX_VALUE);
        }

        NodeInfo left=largestBSTHelper(node.left);
        NodeInfo right=largestBSTHelper(node.right);

        if(left.isBST && right.isBST && node.value > left.max && node.value < right.min){
            int size= left.size+right.size+1;
            int min= Math.min(node.value, left.min);
            int max= Math.max(node.value,right.max);
            return new NodeInfo(true,size,min,max);
        }
        return new NodeInfo(false,Math.max(left.size,right.size),0,0);
    }

    public int findMax(Node node){
        if(node==null){
            return 0;
        }
        int left=findMax(node.left);
        int right=findMax(node.right);
        return Math.max(node.value,Math.max(left,right));
    }

    public void printMax(){
        int lmax=findMax(root.left);
        int rmax=findMax(root.right);
        System.out.println("LMax "+lmax+" Rmax " +rmax);
    }

    public void extremeNodes(){
        extremeNodes(root);
    }
    private void extremeNodes(Node node){
        if(node==null){
            return;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(node);
        boolean flag=false;
        while(!queue.isEmpty()){
            int levelSize= queue.size();
            for(int i=0;i<levelSize;i++){
                Node curr=queue.peek();

                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
                queue.poll();

                if(flag && i==0){
                    System.out.println("Left most=> "+curr.value);
                }
                if(!flag && i==levelSize-1){
                    System.out.println("Right most => "+curr.value);
                }
            }
            flag=!flag;
        }

    }
    public List<Integer> disTanceK(Node node, Node target,int k){

        if(node==null){
            return new ArrayList<>();
        }
        List<Integer> ans= new ArrayList<>();
        Queue<Node> queue=new LinkedList<>();
        queue.add(node);
        int level=1;
        while (!queue.isEmpty()){
            int levelSize=queue.size();
            for(int i=0;i<levelSize;i++){
                Node curr= queue.poll();
                if(curr.value!=target.value && level==k){
                    ans.add(curr.value);
                }
                if(level==k){
                    ans.add(curr.value);
                }
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
            level++;
        }
    return ans;
    }

    public void printDistanceNodes(){
        Node target= new Node(8);
        int k=3;
        List<Integer>ans=disTanceK(root,target,k);
        System.out.println("Nodes =>"+ans);
    }

    private int findDistanceBetweenNodes(Node root, Node node, HashMap<Node, Integer> dismap, int distance) {
        if (root == null) {
            return -1;
        }
        if (root == node) {
            dismap.put(root, distance);
            return 0; // Distance to itself
        }

        // Check left subtree
        int left = findDistanceBetweenNodes(root.left, node, dismap, distance + 1);
        if (left != -1) {
            dismap.put(root, distance); // Store distance of parent node
            return left + 1; // Return distance to parent
        }

        // Check right subtree
        int right = findDistanceBetweenNodes(root.right, node, dismap, distance + 1);
        if (right != -1) {
            dismap.put(root, distance); // Store distance of parent node
            return right + 1; // Return distance to parent
        }

        return -1; // Node not found
    }

    public List<Integer> nodesAtDistanceK(Node root, Node target, int k) {
        HashMap<Node, Integer> map = new HashMap<>();
        findDistanceBetweenNodes(root, target, map, 0);

        List<Integer> ans = new ArrayList<>();
        for (Node node : map.keySet()) {
            if (map.get(node) == k) {
                ans.add(node.value);
            }
        }

        return ans;
    }

    public boolean topTobottomString(Node node,Node target,StringBuilder s){
            if(node==null){
                return false;
            }
            if(node==target){
                return true;
            }
            boolean left=topTobottomString(node.left,target,s);
            boolean right=topTobottomString(node.right,target,s);
            if(left){
                s.append("L");
                return true;
            }
            if(right){
                s.append("R");
                return true;
            }

            return false;
    }
}
    class MinMax {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
    }


    class NodeInfo{
        int min;
        int max;
        boolean isBST;
        int size;

        public NodeInfo( boolean isBST, int size,int min, int max) {
            this.min = min;
            this.max = max;
            this.isBST = isBST;
            this.size = size;
        }
    }

    class Run {
        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
//        int[] arr = {4,5,2, Integer.parseInt(null), Integer.parseInt(null),3,1,6,12};
//          int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13};
//        tree.root = new Node(3);
//        tree.root.left = new Node(9);
//        tree.root.right = new Node(20);
//        tree.findMinmax();
//        List<List<Integer>> ans= tree.verticalOrder();
//        System.out.println(ans);
//          tree.populate(arr);
//        int[] arr={2,4,3};
//        tree.populateTree(arr);


//        tree.boundaryTraversal();
//        System.out.println(tree.ans);
//        tree.preOrder();
//        List<Integer> list1=new ArrayList<>();
//        for(int num:arr){
//            list1.add(num);
//        }
//        System.out.println(tree.pre);
//        System.out.println(tree.pre.equals(list1));
//
//        if(tree.checkPreWithBST(arr)==1){
//            System.out.println("It is pre-order of BST");
//        }else{
//            System.out.println("It is not the pre-order of BST");
//        }
            int[] lca = {1, 2, 3, 4, 5, 6, 7};
//            tree.root = new Node(20);
//            tree.root.left = new Node(8);
//            tree.root.right = new Node(22);
//            tree.root.left.left = new Node(4);
//            tree.root.left.right = new Node(12);
////            tree.root.right.left=new Node(6);
//            tree.root.right.right = new Node(26);
////            tree.root.left.left.left=new Node(8);
////            tree.root.left.left.right=new Node(9);
//            tree.root.left.right.left=new Node(10);
//            tree.root.left.right.right=new Node(14);
//            tree.root.left.right.right.right=new Node(15);
//            tree.root.right.right.right=new Node(15);
//            tree.findLca();
//            tree.display();
//            tree.printLca();
//            tree.findLCAOfTree();
//            int ans=tree.findDistance(tree.root,tree.root.left.left,tree.root.right.left);
////            tree.printDistance();
//            System.out.println("Distance between 4 and 7 is: " + ans);
//            tree.printsumDiffoflevel();
//h         tr
//            tree.printMax();
//            tree.printCount();
//            tree.extremeNodes();
//            tree.display();
//            tree.printDistanceNodes();

            tree.root = new Node(5);
            tree.root.left = new Node(1);
            tree.root.right = new Node(2);
            tree.root.left.left = new Node(3);
            tree.root.right.left=new Node(6);
            tree.root.right.right=new Node(4);

//            tree.root.left.right = new Node(12);
//            tree.root.left.right.left = new Node(10);
//            tree.root.left.right.right = new Node(14);

            // Reference the existing target node
            Node target = tree.root.right.left; // This is the existing node with value 8
            StringBuilder s=new StringBuilder();
            tree.topTobottomString(tree.root,target,s);
            System.out.println(s);
//            System.out.println(tree.s);
//            int k = 2;
//
//            List<Integer> ans = tree.nodesAtDistanceK(tree.root, target, k);
//            System.out.println("Nodes at distance " + k + " from target: " + ans);
//
        }

    }
