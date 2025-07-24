package com.day5_s;

public class timeAndSpaceComplexity {
    //when we have to sort something we required to reduce the tsk execution time
    //so to reduce the time using algorithm complexity analysis
    //time and space are impt aspects of an algorithm

    //video 63 faltu ka gyaan

    //time taken to execute a algo is always different as our main memory has many small patches that stores the algo and every time a different patches may be used by a alog

    //multitasking is  method where a processor multipple cores do many task simoltaneously
    //but in single core parallel processing is not possible so it makes a queue
    //so it will solve some partt of one process and then make it wait for to solve remaining part in waiting area and move to next process and after partially solving cpu then goes back to first remaing process and bring it back to running queue but this process is so fast that human brains thinks it is doing parallel process that its executing many process simoltaneously
    //if we draw a graph of time and input size then the algo with small input size performs better
    //but there is a threshold then then the algo starts performing better as initialy the algo req very small time but when input size incr then real performance of algo is calculated
    //rate of growth -- rate at which running time increases as funct of input


    // asymptotic analysis
    //asymptote -- it is a straight line that constanltly approaches agiains curve but does not meent the x axis ex logarithmic graph
    //it depends on
    //rate of growth of algo
    //behaviour of rate at very high input size

    // asymptotic notations
    //worst ,best ,average
    //best case - big omega
    //avg case - big theta
    //worst case = big O
    //these notations are used to denote the cases


    //big o notation
    //it gives tight upper bound of the given function
    //big of funct f(n) means there is some function g(n) solves that ulta A n>no 0<=f(n)<=c*g(n)  where c is const
     //tight upper bound means as close as possible
    //so if f(n ) performs bad but not worst then c*g(n)


}
