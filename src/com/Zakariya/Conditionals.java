package com.Zakariya;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        /*
           Syntax of If-else
           if(Condition T or F) {
               //do this
           }
           else
           {
              // do this
           }

         */
        System.out.print("Enter your current salary: ");
        Scanner input = new Scanner(System.in);
        float salary = input.nextFloat();

        if(salary>10000){
            salary = salary + 2000;
            System.out.println("Your salary with bonus is: "+salary);
        }
        else
        {
            salary = salary + 1000;
            System.out.println("Your salary with bonus is: "+salary);
        }


    }
}
