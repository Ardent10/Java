package com.Zakariya;

import java.util.Scanner;
// Fibonacci series without loops
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1=0;
        int n2=1;
        System.out.print("Enter the length of Fibonacci Series: ");
        int n = in.nextInt();
        int count = 2;

        System.out.print("Fibonacci Series: "+n1 + " "+n2+" ");
        while (count<=n){
            int temp = n2;
            n2 = n1+n2;
            n1= temp;
            count++;
            System.out.print( n2+" ");
        }
    }
}
