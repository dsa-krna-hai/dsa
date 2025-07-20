package com.day2_s;

public class stiringBuilder {
    //represents mutable sequence of character
    public static void main(String[] args) {
        String s = "sanju";
        StringBuilder ss = new StringBuilder(s);
        System.out.println(ss);
        ss.append("asdf");
        System.out.println(ss);
        //append adds at the end of the string builder

        //insert use to add at specific indez
        ss.insert(2,"df");
        System.out.println(ss);

        //to replace the char use setCharAt
        ss.setCharAt(2,'e');
        System.out.println(ss);
    }
}
