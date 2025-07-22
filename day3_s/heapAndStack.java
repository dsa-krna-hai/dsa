package com.day3_s;

public class heapAndStack {
    //stack memory
    //static Memory allocation
    //fuction calls and primitive data values and reference to objects
    // here we follow a lifo order

    //heap memory
    //it is used for dynamic memory allocation
    //they have global acces
    //its used in java objects and jre

    //java filed is compiled and executed in ram of computer
    //it is called application memory
    //jvm has stack ,heap , class method area and native method area

    //stack memry stores methods in a memory block of stack

    //main functions runs firstt wher we run something
    //if we create some other functions it is stored in stack memory
    //main() is stored at bottom and then all the function that are being called sits on top of main()
    //when the function gets exicuted that function gets removed and the main() gets on top again to call the next funtion

    public static void main(String[] args) {
        a();//after main the a will be in the stack and after its exicution it will be removed and the main will be top on again and now b which is next will be called

        b();//after its exicution again main will be at top
    }
    public static void a(){
        System.out.println("a");


    }
    public static void b(){
        System.out.println("b");
    }


    //heap memory
    //heap memory is larger than stack memory
    //it has many uncused and inaccissible objects which gets removed by garbage collection
    //it has 3 space new,old ,permaneant
    //1) new has 3 space eden survival 1,survival2
    //when eden gets fulled it goes to minor garbage collection and remaining data after it goes to survivor 1 and again garbage collection and remaining data goes to survival 2
    //after data that survives the 3 data garbage collection

    //2)old here data that survives 3 garbage collection is stored
    //3)permanent it stores metadata about classes and also stored java standard libraries


    //heap memory is slow as here we follow a referance rule to store data


}
