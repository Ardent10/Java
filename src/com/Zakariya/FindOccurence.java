package com.Zakariya;

import java.util.Scanner;

public class FindOccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = in.nextInt();
        int copy = num;
        System.out.print("Enter which number's occurrence you want to check: ");
        int digit = in.nextInt();
        int count = 0;

        while (num>0){
           int rem = num % 10;
           if (rem==digit){
               count++;
           }
           num /=10;
        }
        System.out.println("The digit "+digit+" occurred "+count+" times in "+copy);


    }
}
