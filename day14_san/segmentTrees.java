package com.day14_san;

public class segmentTrees {
    //if we have to reduce time complexity of sum of n elements
    //then we use segement tree to reduce time complexity to O(logn)
    //updating data in segement tree is also O(logn)
    //in segment tree each node will contain a query and a interval/range
    //now we devide the interval and query in 2 parts representing child nodes and making tree till range has only 1 element
    //so leaf node contains only 1 element
    //segment tree is a full binary tree
    //1)if we are given a range that is not exactly inside segement tree return output
    //2)if node interval is completly outside the segement tree intervals return default value of the query that is )
    //3) overlapping the segment tree more than 1 node of segment - here merge ans of 2 node and then find the output by reducing the required output

    //updation in segement tree -
    //


}
