package com.Zakariya;

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println("The Numbers are: " + a + " "+ b+ " "+ c);

        if (a>b && a>c){
            System.out.println("A is greatest: "+ a);

        }
        else if(b>a && b>c){
            System.out.println("B is greatest: "+b);
        }
        else
        {
            System.out.println("C is greatest: "+c);
        }

        System.out.println(Math.max(c,Math.max(a,b)));
    }

}
