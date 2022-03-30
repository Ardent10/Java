package com.Zakariya;

public class Swap {
    public static void main(String[] args) {

//        int a= 10;
//        int b = 5;
//
//        swap(10,5);
//        System.out.println("The swapped values are: "+ a +" "+b);
        // this will not swap the values as it is passed by value;

        String name = "Zaky";
        changeName(name);
        System.out.println(name);
//        In java No pass by reference is done. Only pass by value is done.

        // The name was not changed because
        // the pointer name was pointing to the same object as was the
        // naaam. So when we are trying to override it a new object of
        // the pointer naam is created as chom chom dolu which is pointing
        // towards this object only and the original was not altered.
        // A new copy of the reference variable is being created.

    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static String changeName(String naam){
        naam = "Chom chom dolu"; // creeating a new object
        return naam;
    }


}
