package com.day13_san;

public class LinkedQuest {
   class Node{
       int data;
       Node next;
       Node(int data){
           this.data=data;


       }
   }

   Node head;
   public void dis(){
       Node temp;
       temp=this.head;

       while (temp!=null){
           System.out.print(temp.data+" ");
           temp=temp.next;
       }
   }
   public void  addf(int data){
       Node nn = new Node(data);
       nn.next=head;
       head=nn;
       System.out.println(" ");





   }
   public void addl(int data){
       System.out.println(" ");
       Node temp = head;
       if (temp==null){
           addf(data);

       }
       Node nl = new Node(data);
       while (temp.next!=null){
           temp=temp.next;

       }nl.next=null;
       temp.next=nl;

   }
   //reverse using recursion
    public Node reverseRecur(Node head){
       if (head==null || head.next==null){
           return head;

       }
       Node p = reverseRecur(head.next);
       head.next.next=head;
       head.next=null;
       return p;

   }

   public void reverse(){
       System.out.println(" ");
       Node temp=head;
       Node prev = null;
       Node forr;
       while (temp!=null){
          forr=temp.next;
          temp.next=prev;
          prev=temp;
          temp=forr;



       }head=prev;

   }
   //find middle element
    public void Middle(){
       Node temp=head;
       int c = 0;
       while (temp!=null){
           c=c+1;
           temp=temp.next;

       }temp=head;
       int z=c/2;
        int i=0;
        while (i <z-1){
           temp=temp.next;
        }
        System.out.println(temp.data);

    }
    public void merge(Node l1,Node l2){
       Node preHead = new Node(-1);
       Node prev = preHead;
       while(l1 !=null && l2 !=null){
           if (l1.data>l2.data){
               prev.next=l1;
               l1=l1.next;
           }else {
               prev.next=l2;
               l2=l2.next;

           }
           prev=prev.next;


       }

    }
    //intersection of  linked list
    public void intersect(Node l1,Node l2){


    }

    public static void main(String[] args) {
        LinkedQuest l = new LinkedQuest();
        l.addf(23);
        l.dis();
        l.addf(233);

        l.dis();
        l.addl(32);
        l.dis();
        l.reverse();
        l.dis();
        System.out.println(" ");
        l.Middle();



    }
}
