package com.day13_san;

public class customQUeue {
    int [] data;
    int size = 10;
    int end = -1;

    public boolean isFull(){
        return end== data.length-1;

    }
    public boolean isEmpty(){
        return end==0;
    }
    public customQUeue(int size){
        this.data = new int[size];
    }
    public boolean insertQ(int val){
        if (isFull()){
            return false;
        }data[++end]=val;
        return true;
    }
    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("empty queue");

        }
        int remove = data[0];
        for (int i = 1; i < end; i++) {

            data[i-1]=data[i];

        }
        end--;
        return remove;
    }
    public int peek(){
        return data[end];
    }

    public static void main(String[] args) throws Exception {
        customQUeue q = new customQUeue(10);
        q.insertQ(10);
        q.insertQ(14);
        q.insertQ(12);
        q.insertQ(20);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

    }


}
