package com.day3_s;

import java.util.ArrayList;
import java.util.List;

public class quest {
    public static void stringg(String str,int ind ,String out){
        if (ind>=str.length())return;
        if (str.charAt(ind)!='x'){
            stringg(str,ind+1,out+str.charAt(ind));
        }
        else {
            stringg(str,ind,out);
        }
        System.out.println(out  );

    }
    public static void strRep(String str,int ind,String out){
        if (ind==str.length()){
            System.out.println(out);
            return;
        }
        strRep(str,ind+1,out+str.charAt(ind));
        strRep(str,ind+1,out);
    }
    public static List<Integer> result = new ArrayList<>();
    public static void ab(int i, int n){
        if (i<=n){
            if (i!=0)result.add(i);

        }else {
            return;
        }
        for (int j = 0; j < 9; j++) {
            if (i==0 && j==0)continue;
            ab(10*i+j,n);

        }

    }
    public List<Integer> lexicolOrder(int n){
        result.clear();
        ab(0,n);
        return result;
    }

    public static void main(String[] args) {
        String str = "sfghA";
        strRep(str,0,"");
        stringg(str,0,"");
        ab(0,5);
    }
}
