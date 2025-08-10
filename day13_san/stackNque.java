package com.day13_san;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class stackNque {
    //stack
    //it follows a last in first out
    //used in recursion
    //so we push data in and pop data out
    //the last data we pushed in will be pop out first
    //time compl - const
    //queue
    //it follows first in first out
    //here the first element that is pushed will be poped out first
    //
    public static void main(String[] args) {
//        Stack <Integer> ss = new Stack<>();
//        ss.push(123);
//        ss.push(21);
        //ss.push(13);
//
//        System.out.println(ss.pop()); //13 21 123
        Queue<Integer> q = new LinkedList<>();
        q.add(12);
        q.add(23);
        q.add(1);

        System.out.println(q.peek()); //12
        System.out.println(q.remove());//12 printed and removed
        System.out.println(q.peek());//23
//dequeue
        Deque<Integer> de = new ArrayDeque<>();


    }
}
