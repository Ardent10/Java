package com.Zakariya;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float n1 = input.nextFloat();
//        System.out.println("Number: "+n1);

//        Type casting
//        int num = (int)(65.42f);
//        System.out.println("Number is: "+num);

//        Automatic type promotion
//        The range of byte is 256 it cannot store values more than 256
//        int a = 265;
//        byte b = (byte)(a);  // 265 % 256 = 9
//        System.out.println("Byte is: "+b);

//        Confusion
//        byte a = 40;
//        byte b = 50;
//        byte c = 100; // at this intermediate step the byte is exceeding the 256
//        int d = (a * b) / c;
//        The problem is solved as the automatic
//        promotion of bytes into integers in Java
//        System.out.println("Number after converting bytes is: "+d);
//
//        byte b = 50;
//         b = b+5;   // not possible without explicitly type casted


//        Unicode values
//        java works on unicode values
//        int n = 'Z';
//        System.out.println("扎卡里亚");



//        All included
        byte b = 42;
        char c = 'z';
        short s = 1024;
        int i = 5000;
        float f = 5.68f;
        double d = 0.12548;
        double result = (f*b)+(i/c)-(d-s);
//        fliat  + int + double = double is the result
        System.out.println((f*b)+" "+(i/c) +" "+  -(d-s));
        System.out.println("Result:  "+ ((f*b)+(i/c)-(d-s)));



    }
}
