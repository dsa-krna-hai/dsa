package com.day12_san.searching;

public class link {
    class Node{
        Node next;
        int data;

        public Node(int data) {
            this.data=data;
        }
    }Node head;
    public void display(){
        Node temp=this.head;

        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void addtop(int data){
        Node nn = new Node(data);
        nn.next=head;
        this.head=nn;


    }
    public void addlast(int data){
        Node nn = new Node(data);
        Node temp = this.head;
        while (temp!=null){
            temp=temp.next;
        }temp.next=nn;

    }
    
}
