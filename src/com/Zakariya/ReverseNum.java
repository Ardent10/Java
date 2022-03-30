package com.Zakariya;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = in.nextInt();

        int result = 0;
        while(num>0){
            result = result*10+num%10;
            num/=10;
        }

        System.out.println("The reverse of the number is: "+result);
    }
}
