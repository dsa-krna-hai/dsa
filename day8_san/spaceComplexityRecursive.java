package com.day8_san;

public class spaceComplexityRecursive {
    //space complexity of recursive function
    //ex
    static int fact(int n){
        if (n==0){
            return 1;
        }return n*fact(n-1);
    }
    //here a extRA SPAC4E IS  is taken by call stack
    //so space complexity is O(n) as here call stack is carrying n function in  call stack

    //for fibonacchi series
    //here recursive code is not working parrally but still n no. of function call is only taking n space as they keep freeying the space in call stack


     //amortixed analysisi
    //it refers to derermining the time average  running time for a swquence of operations
    //it is differnct form average asymptotic analysis as here we don not make any assumption about data value, wheras in the asymptotic average analysis we assure an overall average performanaces.
    //its is ggod for those situation where alog performs some food and some bad op;erations
    //amaothized ananlysis is a good way for analysing complexity for hose algo which perform very food in most of the cases but extremely bad in some of casses
    //in java is array of fixed size so we can not add data at the end
    //so here we have ArraYlIST
    // to create a dynamic array and have to create a dynamoc array out of it
    //so we can increase the size of array by one and add all data of prev array and add new data at the end of the new array
    //so time compl is O(n+1)
    //we can also make new array of legnht double of prev array
    //now add prev data inside prev array and add it to the new array of double length
    //but this only works when we want to push or pop form last
    //as if we have to add element at the start but here we have to move all data one element to right that take order of n
}
