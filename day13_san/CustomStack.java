package com.day13_san;

public class CustomStack {
    public int [] arr;
    int ptr=-1;
    int s;
    CustomStack(int s){
        this.arr = new int[s];
    }


    public boolean addS(int val){
        ptr++;
        arr[ptr]=val;

        return true;




    }
    public boolean isFull(){
        return ptr== arr.length-1;
    }
    public boolean isEpty(){
        return ptr==-1;
    }
    public int popp(){
       if(isEpty()){
           System.out.println("empty stack");
       }else {

           }
        int d = arr[ptr];
        ptr--;
        return d;

    }
    public int peek(){
        return arr[ptr];
    }

    public static void main(String[] args) {
        CustomStack a = new CustomStack(15);
        a.addS(3);
        a.addS(34);
        a.addS(344);
        System.out.println(a.peek());
        System.out.println(a.popp());


    }
}
