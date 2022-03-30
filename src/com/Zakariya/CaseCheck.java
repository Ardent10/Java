package com.Zakariya;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your String: ");
        char ch = in.next().trim().charAt(0);

        System.out.println("The character at 0th index: "+ch);

        if (ch>='a' && ch<='z'){
            System.out.println("The word is Lowercase: "+ch);
        }
        else if (ch>='A' && ch<='Z')
        {
            System.out.println("The word is in Uppercase: "+ch);
        }
        else
        {
            System.out.println("Invalid character");
        }
    }
}
