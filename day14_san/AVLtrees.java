package com.day14_san;

public class AVLtrees {
    //when we insert sorted elements in BST then a squead tree is formed like 1->2->3->4
    //here seaching becomes O(n) as it is not balanced tree
    //balanced tree -for every node difference of height of left sub tree and right sub tree below it should be 1 ,-1,0
    // AVL adelson velski and lendis tree is used to solve this issue
    //it automatically balances the tree

    //algorithm
    //1)insert normally node n
    //2)startt form node n and go above and find the node that makes the tree unbalanced
    //3)now make it balanced from that node using rotation left or right
    //to rotate
    //here we rotate a tree left or right but while rotating we have to keep in mind that the props of binary are not voilated
    //after rotating child become parent and parent become child
    //4)using 1 of the for rules rotate the tree
    //copy mai likha hai
    //time comp = logn + const(for rotation ) so O(n)
    //

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

        }

        Node root;
        AVLtrees(){

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
            return rotate(n);
        }

    private Node rotate(Node n) {
            if (height(n.left)-height(n.right)>1){
                //its a left heavy case (1,2)
                if (height(n.left.left)-height(n.left.right)>0){
                    //case 1
                    return rightrotate(n);
                }
                if (height(n.left.left)-height(n.left.right)<0){
                   //case 2
                    n.left=leftrotate(n.left);
                    return rightrotate(n);
                }

            }
        if (height(n.left)-height(n.right)<-1){
            //its a right heavy case (3,4)
            if (height(n.right.left)-height(n.right.right)<0){
                //case 3
                return leftrotate(n);
            }
            if (height(n.right.left)-height(n.right.right)>0){
                //case 2
                n.right=leftrotate(n.right);
                return leftrotate(n);
            }

        }
        return n;


    }

    private Node rightrotate(Node p) {
            Node c = p.left;
            Node t = c.right;
            c.right=p;
            p.left=t;
            p.height=Math.max(height(p.left),height(p.right)+1);
        c.height=Math.max(height(c.left),height(c.right)+1);
        return c;


    }

    private Node leftrotate(Node p) {
        Node c=p.right;
        Node t = c.left;
        c.left=p;
        p.right=t;
        p.height=Math.max(height(p.left),height(p.right)+1);
        c.height=Math.max(height(c.left),height(c.right)+1);
        return c;

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
        public void dis(Node n, String s){
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
            AVLtrees b = new AVLtrees();
            int [] arr = {1,2,3,4,5,6};
            b.populate(arr);
            b.dis();

        }



    }



