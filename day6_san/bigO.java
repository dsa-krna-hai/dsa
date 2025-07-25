package com.day6_san;

public class bigO {
    //matric to measure time is no.of instructions executed
    //we can assume every single istruction taken c unit of lies so if we have total instruction we will spend 1<c unit of time

    //every loop exectutes c*n instruction where c is cont so O(n)

    //so if there are 2 nested loops so C*n^2 insturctions are executed so O(n^2)
    //if the no. of instructions calculated in 2 loops are different the no. of iteration will be different but worst case is still O(n^2)


    //quest worst case f
    void a(int n){
        for (int i = 0; i < Math.log(n); i++) {
            System.out.println("a");

        }
        //here the no . of insturction in each iteration is equal to 3
        //no. of total iterations is 3log(n)+3c where 3 c is const
        //so O(log(n))

    }

    //if the 2 loops are not nested and one of the loop is nested
    //so total istruntions will be m+n^2
    //so O(n^2)



}