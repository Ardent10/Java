package com.Zakariya;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Welcome Professor, Please Enter your password: ");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();

        System.out.println("You Password was: " + password);
    }
}
