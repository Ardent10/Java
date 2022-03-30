// When functions are enclosed into a class it is
// called as a Method in the case of java

package com.Zakariya;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

//        Non Function method
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter the two numbers: ");
//        float a = in.nextInt();
//        float b = in.nextInt();
//
//        System.out.println("The Sum of the two numbers are: "+ (a+b));

        System.out.print( "The sum of the two numbers is: " + sum(15,58 ));
    }

//        Creating a function with return type void
//    static void sum(){
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter the two numbers: ");
//        float a = in.nextInt();
//        float b = in.nextInt();
//
//        System.out.println("The Sum of the two numbers are: "+ (a+b));
//    }


//    with return type int
//    static float sum(){
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter the two numbers: ");
//        float a = in.nextInt();
//        float b = in.nextInt();
//        System.out.print("The Sum of the two numbers are: ");
//        return (a+b);
//    }



//  With Arguments
    static int sum(int a, int b){
        int res = a+b;
        return res;
    }

}
