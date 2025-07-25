package com.day6_san;

public class recursionString {
    static  StringBuilder ss = new StringBuilder();
     public static void remove(String s,int x){
         if (x>s.length()-1){
             return;
         }
         if (s.charAt(x)!='a'){
             ss.append(s.charAt(x));

         }remove(s,x+1);

     }
     public static String removeStr(String s,String tar,int a,String ss){


         String[] aa =s.split(" ");
         if (a==aa.length-1){
             return "";
         }

         if (tar!=aa[a]){

             return removeStr(s,tar,a+1,ss+aa[a]);


         }else {removeStr(s,tar,a+1,ss);}

         return ss;


     }

    public static void main(String[] args) {
         String s = "aadfsaaetaa apple apple";
//         remove(s,0);
//
//        System.out.println(ss);
//        String[] aa =s.split(" ");
//        for (String it :aa){
//            System.out.println(it);
//        }

        System.out.println(removeStr(s,"apple",0,""));

    }
}
