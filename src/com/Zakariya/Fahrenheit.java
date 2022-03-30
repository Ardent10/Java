package com.Zakariya;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature in C: ");
        float tempC = in.nextFloat();
        float tempF = (9/5)*tempC +32;
        System.out.println("The temperature in Fahrenheit: "+tempF);
    }
}
