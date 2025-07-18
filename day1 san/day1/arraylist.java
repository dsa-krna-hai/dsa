package com.day1;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        //array list is a array where we dont give its size while initializing
        //here we dont have to enter the size of the array

        //syntax
        ArrayList<Integer> list = new ArrayList<>(20);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(1,34);
        System.out.println(list);
        //output [23,34, 23, 23, 23, 23, 23, 23, 23]
        System.out.println(list.contains(23)); //true
        System.out.println(list.contains(232)); //false
        list.remove(2);
  //
    }











}
