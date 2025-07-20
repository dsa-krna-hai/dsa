package com.day2_s;

import java.util.*;

public class quest2 {
    public static void main(String[] args) {
        //question longest substring
//        String s = "sanju";
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = s.length()-1; j >0; j--){
//                if (s.charAt(i)==s.charAt(j)){
//                    System.out.println(s.substring(i,j));
//                }
//
//            }
//
//        }

        //reverse the words of string
        String aa = "aaj to bhot dsa ho gya";
        reverss(aa);



    }
    public static String reverss(String a){
        a = a.trim();
        List<String> ss = Arrays.asList(a.split(" "));
        Collections.reverse(ss);
        return  String.join(" ",ss);


    }

    //valid palendrom
    //repeadted question


    //largest substringg
    public int max(String s ){
        int[] indices = new int[26];
        int maxlen = -1;
        for(int i = 0;i<s.length();i++){
            int idx = s.charAt(i)-'a';
            if(indices[idx]>0){
                maxlen=Math.max(maxlen,i-indices[idx]);

            }else {
                indices[idx] = i+1;
            }

        }
        return maxlen;
    }
}
