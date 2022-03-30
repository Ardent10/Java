package com.Zakariya;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        Take input from the user till it presses X or x

        while (true) {
//                Take operator as input
            System.out.print("Enter you operator: ");
            char op = in.next().trim().charAt(0);

            System.out.println();
            float result = 0;
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.print("Enter two numbers: ");
                float n1 = in.nextFloat();
                float n2 = in.nextFloat();


                System.out.println();
                if (op == '+') {
                    result = n1 + n2;
                }
                else if (op == '-') {
                    result = n1 - n2;
                }
                else if (op == '*') {
                    result = n1 * n2;
                }
                else if (op == '/') {
                    if(n2!=0){
                        result = n1 / n2;
                    }
                    else{
                        System.out.println("Division not possible");
                    }

                }
                else if (op == '%') {
                    result = n1 % n2;
                }

            }
            else if(op=='x' || op=='X'){
                break;
            }
            else {
                System.out.println("Invalid Operation");
                break;
            }
            System.out.println("Result: "+ result);
        }
    }
}
