package com.day1;

public class loops {
    //types of loops
    //for,while,dowhile

    public static void main(String[] args) {
//        for (int i=0;i<10;i++){
//            System.out.println("hello");
//        }
//        int a =10;
//        while (a>0){
//            System.out.println("minus");
//            a--;
//        }
//        do{
//            System.out.println("do while");
//        }while(a<0);
//
    //question reverse no.
//    int a = 1245;
//    int b =0;
//    while(a>0){
//        int rem = a%10;
//        b= b*10+rem;
//        a=a/10;
//
//
//
//
//    }
//        System.out.println(b);
    //question prime no.
        boolean ab = false;
        int pir=34;
        int i = 1;
        while(i<=pir){
            if (pir%i==0){
                ab=false;


            }
            else {
                ab=true;
            }
            i++;
        }
        if (ab==false){
            System.out.println("not prime");

        }else{
            System.out.println("prime");
        }



}}
