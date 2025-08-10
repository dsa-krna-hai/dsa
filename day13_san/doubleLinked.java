package com.day13_san;

public class doubleLinked {
    //here a node has a  part data,prev addr, next addr
    //here we can move in both the direction

    //1)insertion at begin
    //here we create a node ,
    class Nodee {
        Nodee next ;
        Nodee prev;
        int val;
        Nodee(int val){
            this.val=val;

        }
    }
    Nodee head;
    public void insertf(int val){
        Nodee node = new Nodee(val);
        node.next=head;
        node.prev=null;
        if (head!=null){
            head.prev=node;
        }
        head=node;



    }
    public void dis(){
        Nodee temp = head;
        while(temp!=null){
            System.out.print(temp.val);
            System.out.print("->");



            temp=temp.next;
        } System.out.println(" ");
    }
    public void insertInd(int val,int ind){
        Nodee n = new Nodee(val);
        Nodee temp=head;

        int c=0;
        while (c<ind){
            temp=temp.next;
            c+=1;
        }n.next=temp.next;
        temp.next=n;
        n.prev=temp;
        if (n.next!=null){
            n.next.prev=n;
        }



    }
    public void dispRev(){
        Nodee temp=head;
        while(temp.next!=null){
            temp=temp.next;

        }Nodee last =temp;
        while (last!=null){
            System.out.print(last.val);
            System.out.print(" ");
            last=last.prev;
        }

    }

    public static void main(String[] args) {
        doubleLinked l = new doubleLinked();
        l.insertf(10);
        l.insertf(23);
        l.insertf(236);
        l.insertf(234);
        l.insertInd(12,2);
        l.dis();
        l.dispRev();
    }

}

