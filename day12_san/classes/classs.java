package com.day12_san.classes;

public class classs {
    //an object is a instance of class that has a state and behaviour
    //state of field is when we create a variable and add data to it
    private int gear = 5;


    //behaviour or method is function
    private void hello(){
        System.out.println("hello");
    }
    classs(int s){
        gear=s;
        System.out.println(gear);

    }
    classs(int a ,int s){
        gear =a;
        s=23;
    }


    public static void main(String[] args) {
        classs ab = new classs(43);
        System.out.println(ab.gear);
        classs aa = new classs(ab.gear, 34);
        System.out.println(aa.gear);
        ab.gear=34;
        System.out.println(ab.gear);
        ab.hello();

    }
}
