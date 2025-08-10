package com.day12_san;

public class linkedList {
    //a ll is a data structure that is used for storingg collections of data
    //one block points the next block and same
    //disadv of array
    //its a continous memory location
    // array is static size so we can not add more data
    //here its difficult to add data at start or any position in array

    //linked list
    //in each node or block have 2 things - data and address of next node
    //the first node is being pointed by head pointer
    //in single ll we can only move forward

     class Node{
         int data;
         Node next;

         Node(int data ){
             this.data=data;
         }
    }
   Node head;
     //operations in ll
    //1 traversal
    //to travel the nodes of ll we have a pointer temp that points at start of ll . we can move this temp to move to nextt node
    //time comp = O(n)
    public void display(){
        Node temp = this.head;
        while (temp !=null){
            System.out.print(temp.data);

            temp=temp.next;
        }

    }
    //2) insertinon
    //at begening - here we will create a new node and assign the address of head to it so it points at next node and then point head to new node
    //at last - create a node ,reach the last node ,store next as address of new node
    //at some index - create a new node ,reach at req index now add the new node
    public void addFirst(int data){
        Node nn = new Node(data);
        nn.next=this.head;
        this.head = nn;
        System.out.println(" ");

    }
    public void addLast(int data){
        if (this.head == null){
            addFirst(data);
            return;
        }
        Node temp=this.head;
        Node nl = new Node(data);
        nl.next=null;
        while (temp.next!=null){
            temp = temp.next;

        }temp.next=nl;




    }
    public void addInde(int data,int idx){
        System.out.println(" ");
        Node ni = new Node(data);
        int temp = 0;
        Node tem = this.head;

        while (temp<idx){
            tem=tem.next;
            temp=temp+1;


        }

        Node forr = tem.next;
        tem.next=ni;
        ni.next=forr;
    }
    //3) deletion -
    //remove first - set head as head.next and the previous node will be deleted due to automatic garbage collection
    //remove last - take temp to second last node and make temp.next = null
    //remove at indx - take to that indx-1 make temp.next to next to next node

    public void topDel(){
        head=head.next;
    }
    public int endDel(){
        Node temp = this.head;
        while (temp.next.next !=null){
            temp=temp.next;

        }int a = temp.data;
        temp.next=null;
        return a;
    }



    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.addFirst(56);
        ll.display();
        ll.addFirst(34);
        ll.display();
        ll.addFirst(45);
        ll.addLast(20);
        ll.display();
        ll.addInde(111,2);
        ll.display();
    }
}
