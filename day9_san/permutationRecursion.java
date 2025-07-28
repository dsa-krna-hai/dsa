package com.day9_san;

public class permutationRecursion {
    public static void per(String p,String up){
        int l = up.length();
        if (up.isEmpty()){
            if (p.length() == l ){
                System.out.println(p);
            }
            return;
        }char ch = up.charAt(0);
        per(p+ch,up.substring(1));
        per(p,up.substring(1));

    }

    public static void main(String[] args) {
        per("","hello");
    }
}
