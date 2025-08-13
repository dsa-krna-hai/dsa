package com.day14_san;

import java.util.Random;

public class StringBufferr {
    //Stringg buffer - its a mutable seq of char.
    //these are more efficent then string
    //these are not thread safe - like if many threads are being used on same data , when thread 1 in working on a data then it will not  prevent thread 2 to work on that data .string is not thread safe


    //to gererate a random char
    public String randomSt(int s){
        StringBuffer sb= new StringBuffer(s);
        Random r = new Random();
        for (int i = 0; i <s ; i++) {
            int a = (int) r.nextFloat();
            int b = 97 + a*26;
            sb.append((char) b);

        }
        return sb.toString();

    }


    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append(" hello ");
        sb.append(" there ");
        //out - hello there
        //use insert to add data at a specific index
        sb.insert(7,"the");
        //out  hello the  there
        sb.delete(1,5);
        //out  o the there
        System.out.println(sb.capacity());

        StringBuffer sbb = new StringBuffer(45);
        System.out.println(sbb.capacity());


        String st = sb.toString();
        System.out.println(st);
        StringBufferr sbbb = new StringBufferr();
        System.out.println(sbbb.randomSt(10));
    }
}
