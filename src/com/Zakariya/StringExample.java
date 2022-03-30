package com.Zakariya;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String name = in.next();

//        String message = greet();
//        System.out.println(message);

        String ans =  greet1(name);
        System.out.println(ans);

    }

    // With simple function
    static String greet(){
        String greeting = "Enter your string: ";
        return greeting;
    }

//    With arguments
    static String greet1(String name)
    {
        String message = "Welcome " + name;
        return  message;
    }
}
