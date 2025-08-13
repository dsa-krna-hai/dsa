package com.day14_san;

public class binarySearchTree {
    public static class Node
    {
        int val;
        Node right;
        Node left;
        int height;

        Node(int val){
            this.val=val;
        }
        public int getVal(){
            return val;
        }

    }Node root;
    binarySearchTree(){

    }
    public int height(Node n ){
        if (n==null){
            return -1;

        }return n.height;
    }
    public boolean isEmpty(Node n){
        return n==null;

    }
    public void insert(int val){
        root =  insert(val,root);
    }
    public Node insert(int val , Node n){
        if (n==null ){
            n= new Node(val);
            return n;
        }
        if (val<n.val){
            n.left=insert(val,n.left);
        }if (val>n.val){
            n.right=insert(val,n.right);
        }
        n.height=Math.max(height(n.left),height(n.right))+1;
        return n;
    }
    public boolean balanced(){
        return balanced(root);
    }
    public boolean balanced(Node n ){
        if (n==null){
            return true;
        }
        return Math.abs(height(n.left)-height(n.right))<=1 && balanced(n.left) && balanced(n.right);
    }
    public void dis(){
        dis(this.root,"root node");
    }
    public void dis(Node n,String s){
         if (n==null){
             return;
         }
        System.out.println(s+n.val);
        dis(n.left,"the left of "+n.val+" is : ");
        dis(n.right,"the right of "+n.val+"is :");
    }
    public void populate(int [] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);

        }
    }

    public static void main(String[] args) {
        binarySearchTree b = new binarySearchTree();
        int [] arr = {1,4,3,7,5,7,4,1,9};
        b.populate(arr);
        b.dis();

    }



}
