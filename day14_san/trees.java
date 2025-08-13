package com.day14_san;

import java.util.Scanner;

public class trees {

    //trees is like linkdlist but it can be in 2D
    //here nodes have multiple childs
    //here we seacrch insert or delete with O(logn)
    //but O(n) is of unbalanced binary tree

    //there are self balanced binary trees to solve this issue

    //uses
    //it is used in files system each nodes represent directory
    //network rowting and databases
    //compressions of files

    //props
    //size = no. of nodes in tree
    //the nodes below the node are children of that node
    //edges connect 2 nodes
    //height - max egdes between leaf node and root node
    //level - height of the leaf node from the root

    //types of binary tree
    //complete binary tree - all the levels are filled apart from lastt level but last level must be full from left to right
    //full binary/strict tree- here each node either have 0 or 2 nodes
    //perfect binary tree - all levels are filled and last level is also filled completely
    //height balance tree - avg height is o(logn)
    //skewed binary tree - here each node has only 1 child
    // ordered binary tree - every node has some property
    //binary search tree - binary tree where left node should be smaller than right

    //props of binary tree
    //in perfect BT height is h then total nodes are 2^(h+1)-1
    //and each level(l) has nodes = 2^l
    //leaf node in perfect BT is 2^h
    //if n no. of leaves than min levels are logn +1
    //if  N nodes than the min levels are log(N+1)
    //

    //ways of implementation
    //1) linked representation - using LL
    //2) sequential repres - using array
    //
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }
    }
        Node root;
        public void populate(Scanner s){
            System.out.println("enter value");
            int val = s.nextInt();
            root=new Node(val);
            populate(s,root);
        }
        public void populate(Scanner s,Node n){
            System.out.println("do you want to enter left of (ture or false)"+ n.data);
            boolean choice = s.nextBoolean();
            if (choice==true){
                System.out.println("enter the value for it ");
                int val = s.nextInt();

                n.left=new Node(val);
                populate(s,n.left);


            }
            System.out.println("do you want to enter right of (ture or false) "+ n.data);
            boolean choice2 = s.nextBoolean();
            if (choice2==true){
                System.out.println("enter the value for it ");
                int val = s.nextInt();

                n.right=new Node(val);
                populate(s,n.right);


            }



        }
        public void dis(){
            dis(root," ");

        }
        public void dis(Node n,String s){
            if (n==null){
                return;
            }
            System.out.println(s+n.data);
            dis(n.left,s+" ");
            dis(n.right,s+" ");
        }






    public static void main(String[] args) {
        trees t = new trees();
        Scanner s = new Scanner(System.in);
        t.populate(s);
        t.dis();



    }
}

