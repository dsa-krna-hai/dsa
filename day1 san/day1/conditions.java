package com.day1;

import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        int a = 325;
//        if (a>54){
//            if (a>83){
//                System.out.println("big than 23");
//            }
//            System.out.println(a+"is big");
//        } else if (a==54) {
//            System.out.println("equal");
//
//
//        } else {
//            System.out.println("small");
//        }
        switch (a){
            case 43:
                System.out.println("equal to 43");
                break;

            case 54:
                System.out.println("eqyal to 54");
                break;



            default:
                System.out.println("defautlt");
                break;
        }
        //if break is not used it will directly printt all the switch cases after the codition mathes

//        //question odd/even
//        Scanner sv= new Scanner(System.in);
//        int s = sv.nextInt();
//        if (s%2==0){
//            System.out.println("even");
//
//        }else{
//            System.out.println("odd");
//        }
        //question valid triangle
//
//        int side_a = 43;
//        int side_b = 43;
//        int side_c = 43;
//        if (side_c+side_a+side_b==180){
//            System.out.println("valid triangle");
//
//        }else {
//            System.out.println("sdfjsdhfsdhf");
//        }
        //questin find max of 3 no.
        int abs= 34;
        int bs= 43;
        int sd= 343;
        if (abs>bs && abs>sd){
            System.out.println("abs is largesty");
        }else if (bs>abs && bs>sd){
            System.out.println("abs is largesty");
        }else {
            System.out.println("sd is lasrgest");
        }

    }}

