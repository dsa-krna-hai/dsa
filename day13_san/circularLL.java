package com.day13_san;


import com.day12_san.linkedList;
import org.w3c.dom.Node;

public class circularLL {



    class Node{
        int data;
        Node next;

        Node(int data ){
            this.data=data;
        }
    }
    Node head=null;
    Node tail=null;
    public void insertf(int val){
        Node n = new Node(val);
        if (head == null){
            head=n;
            tail=n;
            return;
        }tail.next=n;
        n.next=head;
        tail=n;

    }
    public void dis(){
        Node temp=head;
        if (head!=null){

            System.out.println(temp.data);
            temp=temp.next;
            while (temp!=head){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public void delf(){
        head=head.next;
        tail.next=head;

    }

    public static void main(String[] args) {
        circularLL n = new circularLL();
        n.insertf(10);
        n.insertf(20);

        n.insertf(130);

        n.dis();
        n.delf();
        n.dis();
    }

}
